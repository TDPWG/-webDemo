package vo;

import pojo.PagePojo;

public class UserManagerVo extends PagePojo{
    private Long user_id;
    private String cust_name;
    private String cust_address;
    private String cust_email;
    private String cust_tel;
    private String emp_name;	//varchar2(30 byte)
	private Long dep_id;	//number(10,0)
	private Long pos_id;	//number(10,0)
	private Long emp_salary;	//number(6,0)
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public String getCust_tel() {
		return cust_tel;
	}
	public void setCust_tel(String cust_tel) {
		this.cust_tel = cust_tel;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Long getDep_id() {
		return dep_id;
	}
	public void setDep_id(Long dep_id) {
		this.dep_id = dep_id;
	}
	public Long getPos_id() {
		return pos_id;
	}
	public void setPos_id(Long pos_id) {
		this.pos_id = pos_id;
	}
	public Long getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(Long emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	

}
