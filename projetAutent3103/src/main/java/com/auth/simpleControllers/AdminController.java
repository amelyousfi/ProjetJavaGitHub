package com.auth.simpleControllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.entities.Admin;
import com.auth.repositories.AdminRepository;
import com.auth.services.AdminService;


@RestController
public class AdminController {
	
	@Autowired
	AdminRepository adminrepo;
	@Autowired
	AdminService adminservice;
	@GetMapping("listeAdmin")
	public List<Admin> listeAdmin() {
		return adminrepo.findAll();
	}
	/*
	@PostMapping("addAdmin")
	public Admin addAdmin(@Valid @RequestBody Admin admin) {
		adminservice.getBCPE();
		return adminservice.saveAdmin(admin);
		
		
	}
	*/

}
