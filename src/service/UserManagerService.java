package service;

import java.util.List;

import vo.UserManagerVo;

public interface UserManagerService {

   public  List getCustInfoList(UserManagerVo customer );
	
	public  UserManagerVo getCustomerById(Long custid);
	
	public  void addCustomer(UserManagerVo userInfo );
	
	public  void deleteCustomerById(Long userid);
	
	public  void  updateCustomer(UserManagerVo customer);
	
	
    public  List  getEmpInfoList(UserManagerVo employee );
	
	public  UserManagerVo getEmpById(Long empid);
	
	public  void addEmp(UserManagerVo userInfo );
	
	public  void deleteEmpById(Long userid);
	
	public  void  updateEmp(UserManagerVo employee);
	
	public  void  updateUserPwd(UserManagerVo employee);
	
	public  void  updateEmpSalaryByEmpId(UserManagerVo employee);

}
