package service;

import java.util.List;

import vo.PermissionVo;

public interface PermissionService {

	public PermissionVo  hasPermission(PermissionVo permissionVo);
	public int addRoles(List  roles);
	
	public int  deleteRoles (PermissionVo permissionVo);
	public int  updateRoles(PermissionVo permissionVo);
	public List getAllRoles();
	
	public  int addAction(PermissionVo permissionVo);
	public  int updateAction(PermissionVo permissionVo);
	public  int deleteAction(PermissionVo permissionVo);
	public  List getAllActions(PermissionVo permissionVo);
	public  List getActionsByRoles(PermissionVo permissionVo); 
	
	public int  addPermission(PermissionVo permissionVo);
	public int  deletePermission(PermissionVo permissionVo);
	public List getPermissions(PermissionVo permissionVo);
	
}
