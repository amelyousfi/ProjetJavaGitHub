package com.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auth.entities.Admin;
import com.auth.entities.Recommandation;
import com.auth.entities.Role;
import com.auth.entities.Sortie;
import com.auth.repositories.RecommandationRepository;
import com.auth.repositories.RoleRepository;
import com.auth.services.AdminService;
import com.auth.services.SortieService;


@SpringBootApplication
public class ProjetAutent3103Application implements CommandLineRunner {
	@Autowired
	RecommandationRepository recommandationRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	SortieService sortieService;
	@Autowired 
	AdminService adminService;
	


	public static void main(String[] args) {
		SpringApplication.run(ProjetAutent3103Application.class, args);
	}
	
	//@Bean
	// avoir un BCryptEncoder qui est initialisÃ© une et une seule fois
	//public BCryptPasswordEncoder getBCPE()
	//{
		//return new BCryptPasswordEncoder();
		
	//}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// creer des utilisateurs avec des roles pour acceder
		
		Recommandation recommandation= new Recommandation("titrerecommanadation1", "text1", "01/04/2022");
		 recommandationRepository.save(recommandation);
		 Sortie sortie=new Sortie("titre1sortie", "destination1sortie", "depart1sortie", "retoursortie", "respensablesortie", "descriptionsortie");
		 sortieService.saveSortie(sortie);
		 Role role1=new Role("Admin");
		 Role role2=new Role("user");
		 roleRepository.save(role1);
		 roleRepository.save(role2);
		
		 /*
		  * 
		  * accountServiceImplement.saveUser(new User("admin", "monadmin",1, null));
		accountServiceImplement.saveRole(new Role("administrateur"));
		accountServiceImplement.addRoleToUser("admin", "administrateur");
		accountServiceImplement.saveUser(new User("user", "monuser",1, null));
		accountServiceImplement.saveRole(new Role("utilisateur"));
		accountServiceImplement.addRoleToUser("user", "utilisateur");
		
		 */
		 
		 adminService.saveAdmin(new Admin("admin1",1,"admin1",null));
		 adminService.addRoleToUser("admin1", "Admin");
		 
		 
		 
		
		
	}

}
