package service;

import pojo.UserInfoPojo;
import vo.LoginVo;

public interface LoginService {

	public LoginVo login(UserInfoPojo user);
	public void  tran_signUp(UserInfoPojo user );
	public void  Logoff(Long user_id);
	public void  updateUserInfo(UserInfoPojo user);
}
