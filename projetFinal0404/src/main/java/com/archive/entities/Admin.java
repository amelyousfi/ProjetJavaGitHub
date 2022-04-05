package com.archive.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Admin {
	//login active password nomComplet adress telephone
	
	@Id	
	@NotNull(message="le login ne doit pas etre null")
	private String login;
	private int active;
	@NotNull(message="le password ne doit pas etre null")
	private String password;
	@NotNull(message="le nomComplet ne doit pas etre null")
	@Size(min=4,max=50)
	private String nomComplet;
	@NotNull(message="l adress ne doit pas etre null")
	private String adress;
	@NotNull(message="le numero de tel ne doit pas etre null")
	private String telephone;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles=new ArrayList<Role>();
	//on enleve le tableau , on utilise ce tableau quand cette relation est dominante
	//@OneToOne(mappedBy = "admin")
	//private Sortie sortie;
	
	public String getLogin() {
		return login;
	}
	public void setAdminlogin(String login) {
		this.login = login;
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
	
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public Admin(@NotNull(message = "le login ne doit pas etre null") String login, int active,
			@NotNull(message = "le password ne doit pas etre null") String password,
			@NotNull(message = "le nomComplet ne doit pas etre null") @Size(min = 4, max = 50) String nomComplet,
			@NotNull(message = "l adress ne doit pas etre null") String adress,
			@NotNull(message = "le numero de tel ne doit pas etre null") String telephone, Collection<Role> roles) {
		super();
		this.login = login;
		this.active = active;
		this.password = password;
		this.nomComplet = nomComplet;
		this.adress = adress;
		this.telephone = telephone;
		this.roles = roles;
	}
	public Admin() {
		super();
	}
	
	
	
	
	
	

}
