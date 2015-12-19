package pojo;

public class UserRolesPojo {
	private Integer role_id;	//number(5,0)
	private String role_name;	//varchar2(30 byte)
	private String role_desc;	//varchar2(200 byte)
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}

	
}
