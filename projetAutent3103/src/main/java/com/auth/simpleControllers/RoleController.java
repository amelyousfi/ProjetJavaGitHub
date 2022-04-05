package com.auth.simpleControllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.entities.Role;
import com.auth.repositories.RoleRepository;

@RestController
public class RoleController {
	@Autowired
	RoleRepository rr;
	@GetMapping
	public String welcom() {
		return "wwelcom to Role";
	}
	  
	@GetMapping("listRole")
	public List<Role> liseRole(){
		return rr.findAll();
		                                   
	}
	@PostMapping
	public Role addRole(@Valid @RequestBody Role role) {
		return rr.save(role);
		
	}
	@DeleteMapping("/{id}")
	public void deleteRole(@PathVariable String id) {
		rr.deleteById(id);
	}

}
