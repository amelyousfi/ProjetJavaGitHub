package com.auth.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Admin {
@Id	
@NotNull(message="le adminlogin ne doit pas etre null")
private String adminlogin;
private int active;
@NotNull(message="le password ne doit pas etre null")
private String password;
@ManyToMany(fetch = FetchType.EAGER)
private Collection<Role> roles=new ArrayList<Role>();
public String getAdminlogin() {
	return adminlogin;
}
public void setAdminlogin(String adminlogin) {
	this.adminlogin = adminlogin;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Collection<Role> getRoles() {
	return roles;
}
public void setRoles(Collection<Role> roles) {
	this.roles = roles;
}

public Admin(@NotNull(message = "le adminlogin ne doit pas etre null") String adminlogin, int active,
		@NotNull(message = "le password ne doit pas etre null") String password, Collection<Role> roles) {
	super();
	this.adminlogin = adminlogin;
	this.active = active;
	this.password = password;
	this.roles = roles;
}
public Admin() {
	super();
}


}
