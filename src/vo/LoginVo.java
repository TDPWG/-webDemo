package vo;

import java.util.Date;
import java.util.List;


public class LoginVo {
	private  Long user_id;
	private  String user_name;
	private  String pwd;
	private  List roles;
	private  Short is_employee;
	private  Date  last_login_time;
	private  Date  last_logoff_time;
	
	
	
	
	public Date getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}
	public Date getLast_logoff_time() {
		return last_logoff_time;
	}
	public void setLast_logoff_time(Date last_logoff_time) {
		this.last_logoff_time = last_logoff_time;
	}
	public Short getIs_employee() {
		return is_employee;
	}
	public void setIs_employee(Short is_employee) {
		this.is_employee = is_employee;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List getRoles() {
		return roles;
	}
	public void setRoles(List roles) {
		this.roles = roles;
	}
	

	
	
}
