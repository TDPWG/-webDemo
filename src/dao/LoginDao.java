package dao;

import java.util.List;

import pojo.BasePermissionPojo;
import pojo.UserInfoPojo;
import vo.LoginVo;

public interface LoginDao {
	public LoginVo getuserInfoByLogin(UserInfoPojo user);
	public void updateLoginTime(Long user_id);
	public void updateLogoffTime(Long user);
	public void updateUserInfo(UserInfoPojo user);
	public List  getRolesByUserId(Long userid);
	public void  addUser(UserInfoPojo user);
	public void  addPermission(BasePermissionPojo bp);
	
}
