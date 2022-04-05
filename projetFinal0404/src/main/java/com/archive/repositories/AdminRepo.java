package com.archive.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archive.entities.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {
	public Admin findByLogin(String login);
	
	public Optional<Admin> findByNomComplet(String nomComplet);

}
