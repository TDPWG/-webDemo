package intercepter;


import org.apache.ibatis.executor.parameter.ParameterHandler;  
import org.apache.ibatis.executor.resultset.ResultSetHandler;  
import org.apache.ibatis.executor.statement.StatementHandler;  
import org.apache.ibatis.mapping.BoundSql;  
import org.apache.ibatis.mapping.MappedStatement;  
import org.apache.ibatis.plugin.*;  
import org.apache.ibatis.reflection.MetaObject;  
import org.apache.ibatis.reflection.SystemMetaObject;  
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;  
import org.apache.log4j.Logger;  
  


import java.sql.*;  
import java.util.List;  
import java.util.Properties;  
  
/** 
 * Mybatis - ͨ�÷�ҳ������ 
 * @author liuzh/abel533/isea 
 * Created by liuzh on 14-4-15. 
 */  

public abstract class PageIntercepter implements Interceptor {  
    private static final Logger logger = Logger.getLogger(PageIntercepter.class);  
  
    public static final ThreadLocal<Page> localPage = new ThreadLocal<Page>();  
  
    /** 
     * ��ʼ��ҳ 
     * @param pageNum 
     * @param pageSize 
     */  
    public static void startPage(Long pageNum, Long pageSize) {  
        localPage.set(new Page(pageNum, pageSize));  
    }  
    
    public static void startPage(Page page) {  
    	if(page==null)return;
        localPage.set(page);  
    } 
  
    /** 
     * ������ҳ�����ؽ�����÷������뱻���ã�����localPage��һֱ������ȥ��ֱ����һ��startPage 
     * @return 
     */  
    public static Page endPage() {  
    	try{
    		Page page = localPage.get();  
    		return page;  
    	}finally{
    		localPage.remove(); 
    	}
    }  
  
    @Override  
    public Object intercept(Invocation invocation) throws Throwable {  
        if (localPage.get() == null) {  
            return invocation.proceed();  
        }  
        if (invocation.getTarget() instanceof StatementHandler) {  
            StatementHandler statementHandler = (StatementHandler) invocation.getTarget();  
            MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);  
            // ������������(����Ŀ������ܱ�������������أ��Ӷ��γɶ�δ���ͨ�����������ѭ��  
            // ���Է������ԭʼ�ĵ�Ŀ����)  
            while (metaStatementHandler.hasGetter("h")) {  
                Object object = metaStatementHandler.getValue("h");  
                metaStatementHandler = SystemMetaObject.forObject(object);  
            }  
            // �������һ����������Ŀ����  
            while (metaStatementHandler.hasGetter("target")) {  
                Object object = metaStatementHandler.getValue("target");  
                metaStatementHandler = SystemMetaObject.forObject(object);  
            }  
            MappedStatement mappedStatement = (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");  
            //��ҳ��Ϣif (localPage.get() != null) {  
            Page page = localPage.get();  
            BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");  
            // ��ҳ������Ϊ��������parameterObject��һ������  
            String sql = boundSql.getSql();  
            // ��дsql  
            String pageSql = buildPageSql(sql, page);  
            //��д��ҳsql  
            metaStatementHandler.setValue("delegate.boundSql.sql", pageSql);  
            Connection connection = (Connection) invocation.getArgs()[0];  
            // �����ҳ���������ҳ����  
            setPageParameter(sql, connection, mappedStatement, boundSql, page);  
            // ��ִ��Ȩ������һ��������  
            return invocation.proceed();  
        } else if (invocation.getTarget() instanceof ResultSetHandler) {  
            Object result = invocation.proceed();  
            Page page = localPage.get();  
            page.setResult((List) result);  
            return result;  
        }  
        return null;  
    }  
  
    /** 
     * ֻ�������������͵� 
     * <br>StatementHandler 
     * <br>ResultSetHandler 
     * @param target 
     * @return 
     */  
    @Override  
    public Object plugin(Object target) {  
        if (target instanceof StatementHandler || target instanceof ResultSetHandler) {  
            return Plugin.wrap(target, this);  
        } else {  
            return target;  
        }  
    }  
  
    @Override  
    public void setProperties(Properties properties) {  
  
    }  
  
    /** 
     * �޸�ԭSQLΪ��ҳSQL 
     * @param sql 
     * @param page 
     * @return 
     */  
    public abstract String buildPageSql(String sql, Page page);
  
    /** 
     * ��ȡ�ܼ�¼�� 
     * @param sql 
     * @param connection 
     * @param mappedStatement 
     * @param boundSql 
     * @param page 
     */  
    private void setPageParameter(String sql, Connection connection, MappedStatement mappedStatement,  
                                  BoundSql boundSql, Page page) {  
        // ��¼�ܼ�¼��  
        String countSql = "select count(0) from (" + sql + ")temp ";  
        PreparedStatement countStmt = null;  
        ResultSet rs = null;  
        try {  
            countStmt = connection.prepareStatement(countSql);  
            BoundSql countBS = new BoundSql(mappedStatement.getConfiguration(), countSql,  
                    boundSql.getParameterMappings(), boundSql.getParameterObject());  
            setParameters(countStmt, mappedStatement, countBS, boundSql.getParameterObject());  
            rs = countStmt.executeQuery();  
            long totalCount = 0;  
            if (rs.next()) {  
                totalCount = rs.getInt(1);  
            }  
            page.setTotal(totalCount);  
            long totalPage = totalCount / page.getPageSize() + ((totalCount % page.getPageSize() == 0) ? 0 : 1);  
            page.setPages(totalPage);  
        } catch (SQLException e) {  
            logger.error("Ignore this exception", e);  
        } finally {  
            try {  
                rs.close();  
            } catch (SQLException e) {  
                logger.error("Ignore this exception", e);  
            }  
            try {  
                countStmt.close();  
            } catch (SQLException e) {  
                logger.error("Ignore this exception", e);  
            }  
        }  
    }  
  
    /** 
     * �������ֵ 
     * @param ps 
     * @param mappedStatement 
     * @param boundSql 
     * @param parameterObject 
     * @throws SQLException 
     */  
    private void setParameters(PreparedStatement ps, MappedStatement mappedStatement, BoundSql boundSql,  
                               Object parameterObject) throws SQLException {  
        ParameterHandler parameterHandler = new DefaultParameterHandler(mappedStatement, parameterObject, boundSql);  
        parameterHandler.setParameters(ps);  
    }  
  
   
}  