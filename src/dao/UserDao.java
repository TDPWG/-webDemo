package dao;

import java.util.List;

import pojo.UserInfoPojo;

public interface UserDao {

	public int addUser();
	public int updateUser();
	public int deleteUser();
	public List getUserList();
	public UserInfoPojo getUserById();

}
