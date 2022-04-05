package com.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.entities.Role;

import com.auth.repositories.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository  roleRepository;
	public Role addRole(Role role) {
		return roleRepository.save(role);
		
		
	}
	
	public void deleteRole(String rolename) {
		roleRepository.deleteById(rolename);
		
	}
	
}
