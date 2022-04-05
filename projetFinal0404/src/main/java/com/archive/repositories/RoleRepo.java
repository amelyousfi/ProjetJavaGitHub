package com.archive.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.archive.entities.Role;

public interface RoleRepo extends JpaRepository<Role, String> {
	public Role findByRolename(String rolename);
	
}
