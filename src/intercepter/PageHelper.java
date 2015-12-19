package intercepter;

import java.sql.Connection;
import java.sql.Statement;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Signature;


@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class}),  
    @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})})  
public class PageHelper  extends PageIntercepter{

	@Override
	public String buildPageSql(String sql, Page page) {   //ʵ�ָ������������Ϳ�����ɲ�ͬ���ݿ�ķ�ҳ,������mysql�ķ�ҳ
		StringBuilder pageSql = new StringBuilder(200);  
        //oracle�ķ�ҳsql����  
        pageSql.append(sql);  
        pageSql.append("  limit ");
        long startRow=page.getStartRow();
        startRow=startRow>=0?startRow:0;
        pageSql.append(startRow).append(",").append(page.getPageSize());
        return pageSql.toString();  
	}

}
