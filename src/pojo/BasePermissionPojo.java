package pojo;

import java.util.List;

public class BasePermissionPojo {
	private  Long user_id;
	private  Integer  role_id=2;
	private  Long  ru_id;
	
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Long getRu_id() {
		return ru_id;
	}
	public void setRu_id(Long ru_id) {
		this.ru_id = ru_id;
	}
	
	
}
