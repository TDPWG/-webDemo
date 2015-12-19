package intercepter;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import vo.PermissionVo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

import dao.PermissionDao;

public class PermissionInterceptor implements Interceptor {

	private static final long serialVersionUID = -2710164696716570519L;

	@Autowired
	private PermissionDao permissionService;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext tx = invocation.getInvocationContext();
		HttpServletResponse  response= (HttpServletResponse) tx.getContext().get(ServletActionContext.HTTP_RESPONSE);
		response.setCharacterEncoding("utf-8");
		PrintWriter writer=response.getWriter();
		try {
			Map session = tx.getSession();
			Long user_id = (Long) session.get("user_id");
			List roles = (List) session.get("roles");
			System.out.println("#####################");

		
			if(user_id==null){ return "nolog"; }
			 
			String actionName = invocation.getProxy().getActionName();
			String nameSpace = invocation.getProxy().getNamespace();
			PermissionVo permissionVo = new PermissionVo();
			permissionVo.setAction_name(actionName);
			permissionVo.setNameSpace(nameSpace);
			permissionVo.setRoles(roles);
			permissionVo = permissionService.hasPermission(permissionVo);

			
			System.out.println(nameSpace + "," + actionName + "##############");
			if (permissionVo == null) {
				
				writer.write("\"权限不够!\"");
				writer.flush();
				writer.close();
				return "noPermission";
			}
		} catch (Exception e) {
			e.printStackTrace();
			writer.write("\"操作失败!\"");
			writer.flush();
			writer.close();
			return "success";
		}
		writer.close();
		return invocation.invoke();
	}

}
