package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.UserInfoPojo;
import service.LoginService;
import vo.LoginVo;

import com.opensymphony.xwork2.ModelDriven;


@Controller
public  class LoginAction extends BaseAction implements ModelDriven<UserInfoPojo>,ServletRequestAware{

	private static final long serialVersionUID = -3136542363815181798L;
	private UserInfoPojo userInfoPojo=new UserInfoPojo();
	
	public UserInfoPojo getUserInfoPojo() {
		return userInfoPojo;
	}

	public void setUserInfoPojo(UserInfoPojo userInfoPojo) {
		this.userInfoPojo = userInfoPojo;
	}
	

	@Autowired
	private LoginService loginService;
	
    private HttpServletRequest request;
   
	


	public String login(){
		try{
			LoginVo loginVo=null;
			if(userInfoPojo.getUser_id()==null||userInfoPojo.getPwd()==null
					||userInfoPojo.getPwd().trim().equals("")){
				this.formatData("用户或密码为空!");
				return SUCCESS;
			}
			loginVo=loginService.login(userInfoPojo);

			if(loginVo!=null){
				HttpSession session=request.getSession();
				session.setAttribute("user_id", loginVo.getUser_id());
				session.setAttribute("user_name", loginVo.getUser_name());
				session.setAttribute("roles", loginVo.getRoles());
				session.setAttribute("is_employee", loginVo.getIs_employee());
				this.formatData("登录成功!");
				return SUCCESS;
			}
		}catch(Exception e){
			e.printStackTrace();
			this.formatData("登录异常!");
			return SUCCESS;
		}
		this.formatData("用户或密码错误!");
		return SUCCESS;
	}
	
	
	public  String  logoff(){
        
		try{
			LoginVo loginVo=null;
			if(userInfoPojo!=null){
				loginVo=loginService.login(userInfoPojo);
			}
			
			if(loginVo!=null){
				HttpSession session=request.getSession();
				session.removeAttribute("user_id");
				session.removeAttribute("user_name");
				session.removeAttribute("roles");
				session.removeAttribute("is_employee");
			}
			this.formatData( "注销登录成功!");
		}catch(Exception e){
			e.printStackTrace();
			this.formatData( "注销失败!");
			return SUCCESS;
		}
		
		return SUCCESS;
	}
	
	public String signUp(){
		try{
			if(userInfoPojo.getUser_name()==null||userInfoPojo.getPwd()==null){
				this.formatData("注册失败!");
				return SUCCESS;
			}
			
			loginService.tran_signUp(userInfoPojo);
			this.formatData("注册成功!");
		}catch(Exception e){
			e.printStackTrace();
			this.formatData("注册失败!");
			return SUCCESS;
		}
		return SUCCESS;
	}
	
	
	@Override
	public UserInfoPojo getModel() {
		if(userInfoPojo==null){
			return new UserInfoPojo();
		}
		return  userInfoPojo;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0){
		this.request=arg0;
	}
	
	
}
