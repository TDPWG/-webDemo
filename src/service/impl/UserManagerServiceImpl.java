package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import service.UserManagerService;
import vo.UserManagerVo;
import dao.UserManagerDao;

public class UserManagerServiceImpl implements UserManagerService {

	@Autowired
	private UserManagerDao userManagerDao;
	
	@Override
	public List getCustInfoList(UserManagerVo customer) {
		return userManagerDao.getCustInfoList(customer);
	}

	@Override
	public UserManagerVo getCustomerById(Long custid) {
		return userManagerDao.getCustomerById(custid);
	}

	@Override
	public void addCustomer(UserManagerVo userInfo) {
		userManagerDao.addCustomer(userInfo);
	}

	@Override
	public void deleteCustomerById(Long userid) {
		userManagerDao.deleteCustomerById(userid);
		
	}

	@Override
	public void updateCustomer(UserManagerVo customer) {
		userManagerDao.updateCustomer(customer);
		
	}

	@Override
	public List getEmpInfoList(UserManagerVo employee) {
		
		return userManagerDao.getEmpInfoList(employee);
	}

	@Override
	public UserManagerVo getEmpById(Long empid) {
		return userManagerDao.getEmpById(empid);
	}

	@Override
	public void addEmp(UserManagerVo userInfo) {
		userManagerDao.addEmp(userInfo);
		
	}

	@Override
	public void deleteEmpById(Long userid) {
		userManagerDao.deleteEmpById(userid);
		
	}

	@Override
	public void updateEmp(UserManagerVo employee) {
		userManagerDao.updateEmp(employee);
		
	}

	@Override
	public void updateUserPwd(UserManagerVo user) {
		userManagerDao.updateUserPwd(user);
		
	}

	@Override
	public void updateEmpSalaryByEmpId(UserManagerVo employee) {
		userManagerDao.updateEmpSalaryByEmpId(employee);
		
	}

}
