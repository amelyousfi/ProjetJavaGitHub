package com.archive.services;

import java.util.List;
import java.util.Optional;

import com.archive.entities.Role;

public interface RoleInterface {
	public List<Role> findAll();
	public Role addRole(Role role);
	public Optional<Role>  findRoleByRolename(String rolename);
	public void deleteAdmin(String rolename);

}
