package dao;

import pojo.DepartmentPojo;

public interface DepManagerDao {
	public void  addDepartment(DepartmentPojo dep);
	public void  deleteDepById(Long dep_id);
	public void updateDepById(DepartmentPojo dep);
	public DepartmentPojo getDepById(Long dep_id);
	public DepartmentPojo getDepartments(DepartmentPojo dep);
	
}
