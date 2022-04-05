package com.archive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.archive.entities.Admin;
import com.archive.entities.Role;
import com.archive.services.AdminService;
import com.archive.services.RoleService;



@SpringBootApplication



public class ProjetFinal0404Application implements CommandLineRunner {
	@Autowired
	RoleService roleService;
	@Autowired 
	AdminService adminService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetFinal0404Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Role role1=new Role("guide");
		Role role2=new Role("organisateur");
		roleService.addRole(role1);
		roleService.addRole(role2);
		Admin admin1=new Admin("adminlogin1", 1, "adminpassword", "administrateur1", "lagny-sur-marne", "0741213589", null);
		
		adminService.addAdmin(admin1);
		adminService.addRoleToAdmin("adminlogin1", "guide");
		
		
		
		
		
		
		
	}

}
