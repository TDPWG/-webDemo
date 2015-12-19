package pojo;

import java.util.Date;

public class UserInfoPojo extends PagePojo {

	private  Long user_id;
	private  String user_name;
	private  String pwd;
	private  Short is_imployee;
	private  Date  last_login_time;
	private  Date  last_logoff_time;
	private  Date  last_modify_time;
	private  String last_modifier;
	private  Date  sinup_time;
	
	
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
	public Date getLast_modify_time() {
		return last_modify_time;
	}
	public void setLast_modify_time(Date last_modify_time) {
		this.last_modify_time = last_modify_time;
	}
	public String getLast_modifier() {
		return last_modifier;
	}
	public void setLast_modifier(String last_modifier) {
		this.last_modifier = last_modifier;
	}
	public Date getSinup_time() {
		return sinup_time;
	}
	public void setSinup_time(Date sinup_time) {
		this.sinup_time = sinup_time;
	}
	public Short getIs_imployee() {
		return is_imployee;
	}
	public void setIs_imployee(Short is_imployee) {
		this.is_imployee = is_imployee;
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
	
	
}
