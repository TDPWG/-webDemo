package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import service.PermissionService;
import vo.PermissionVo;
import dao.PermissionDao;

public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private PermissionDao  permissionDao;

	@Override
	public PermissionVo hasPermission(PermissionVo permissionVo) {
		return permissionDao.hasPermission(permissionVo);
	}

	@Override
	public int addRoles(List roles) {
		return permissionDao.addRoles(roles);
	}

	@Override
	public int deleteRoles(PermissionVo permissionVo) {
		return permissionDao.deleteRoles(permissionVo);

	}

	@Override
	public int updateRoles(PermissionVo permissionVo) {
	
		return permissionDao.updateRoles(permissionVo);
	}

	@Override
	public List getAllRoles() {
		return permissionDao.getAllRoles();
	}

	@Override
	public int addAction(PermissionVo permissionVo) {
		return permissionDao.addAction(permissionVo);
	}

	@Override
	public int updateAction(PermissionVo permissionVo) {
		return permissionDao.updateAction(permissionVo);
	}

	@Override
	public int deleteAction(PermissionVo permissionVo) {
		return permissionDao.deleteAction(permissionVo);
	}

	@Override
	public List getAllActions(PermissionVo permissionVo) {
		return permissionDao.getActions(permissionVo);
	}

	@Override
	public List getActionsByRoles(PermissionVo permissionVo) {
		return permissionDao.getActions(permissionVo);
	}

	@Override
	public int addPermission(PermissionVo permissionVo) {
		return permissionDao.addPermission(permissionVo);
	}

	@Override
	public int deletePermission(PermissionVo permissionVo) {
		return permissionDao.deletePermission(permissionVo);
	}

	@Override
	public List getPermissions(PermissionVo permissionVo) {
		return permissionDao.getPermissions(permissionVo);
	}
	
	
}
