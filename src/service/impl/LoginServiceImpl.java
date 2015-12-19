package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pojo.BasePermissionPojo;
import pojo.UserInfoPojo;
import service.LoginService;
import vo.LoginVo;
import dao.LoginDao;

@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public LoginVo login(UserInfoPojo user) {
		LoginVo loginVo=loginDao.getuserInfoByLogin(user);
		if(loginVo!=null){
			List list =loginDao.getRolesByUserId(loginVo.getUser_id());
			loginDao.updateLoginTime(loginVo.getUser_id());
			loginVo.setRoles(list);
		}
		return loginVo;
	}

	@Override
	public void tran_signUp(UserInfoPojo user) {
		loginDao.addUser(user);
		BasePermissionPojo bp=new BasePermissionPojo();
		bp.setUser_id(user.getUser_id());
		loginDao.addPermission(bp);
	}

 

	@Override
	public void Logoff(Long user_id) {
		loginDao.updateLogoffTime(user_id);
	}

	@Override
	public void updateUserInfo(UserInfoPojo user) {
		 loginDao.updateUserInfo(user);
		
	}
}