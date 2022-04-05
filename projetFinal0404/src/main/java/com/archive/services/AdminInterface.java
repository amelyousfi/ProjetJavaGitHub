package com.archive.services;

import java.util.List;
import java.util.Optional;

import com.archive.entities.Admin;

public interface AdminInterface {
	public List<Admin> findAll();
	public Admin addAdmin(Admin admin);
	public Optional<Admin> findAdminByLogin(String login);
	public void deleteAdmin(String login);
	public Admin searchParLogin(String login);
	public Optional<Admin> searchParNomComplet(String nomComplet);
	public  void addRoleToAdmin(String login,String rolename);
	

}
