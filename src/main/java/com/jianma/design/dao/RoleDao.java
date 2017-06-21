package com.jianma.design.dao;

import com.jianma.design.model.Role;

public interface RoleDao {
	
	public void createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
    
}
