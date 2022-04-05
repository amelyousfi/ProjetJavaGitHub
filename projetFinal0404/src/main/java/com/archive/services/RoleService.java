package com.archive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.entities.Role;
import com.archive.repositories.RoleRepo;
@Service
public class RoleService implements RoleInterface {
@Autowired
RoleRepo roleRepo;
	@Override
	public List<Role> findAll() {
		
		return roleRepo.findAll();
	}

	@Override
	public Role addRole(Role role) {
		
		return roleRepo.save(role);
	}

	@Override
	public Optional<Role> findRoleByRolename(String rolename) {
		
		return roleRepo.findById(rolename);
	}

	@Override
	public void deleteAdmin(String rolename) {
		roleRepo.deleteById(rolename);
		
	}

}
