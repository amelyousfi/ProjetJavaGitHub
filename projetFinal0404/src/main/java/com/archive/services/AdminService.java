package com.archive.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.entities.Admin;
import com.archive.entities.Role;
import com.archive.repositories.AdminRepo;
import com.archive.repositories.RoleRepo;

@Service
public class AdminService implements AdminInterface {
	@Autowired
	AdminRepo adminrepo;
	@Autowired
	RoleRepo roleRepo;

	@Override
	public List<Admin> findAll() {
		return adminrepo.findAll();
		
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminrepo.save(admin);
	}

	@Override
	public Optional<Admin> findAdminByLogin(String login) {
		return adminrepo.findById(login);
		
	}

	@Override
	public void deleteAdmin(String login) {
		
		adminrepo.deleteById(login);
		
	}

	@Override
	public Admin searchParLogin(String login) {
		// TODO Auto-generated method stub
		return adminrepo.findByLogin(login);
	}

	@Override
	public Optional<Admin> searchParNomComplet(String nomComplet) {
		// TODO Auto-generated method stub
		return adminrepo.findByNomComplet(nomComplet);
	}

	@Override
	public void addRoleToAdmin(String login, String rolename) {
		// TODO Auto-generated method stub
		
		Role role=roleRepo.findByRolename(rolename);
		Admin admin1=adminrepo.findByLogin(login);
		admin1.getRoles().add(role);
		
	}
	

}
