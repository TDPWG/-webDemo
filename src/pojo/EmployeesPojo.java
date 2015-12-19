package pojo;

public class EmployeesPojo {
	private Long emp_id	;//number(10,0)
	private Long user_id;	//number(10,0)
	private String emp_name;	//varchar2(30 byte)
	private Long dep_id;	//number(10,0)
	private Long pos_id;	//number(10,0)
	private Long emp_salary;	//number(6,0)
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
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
