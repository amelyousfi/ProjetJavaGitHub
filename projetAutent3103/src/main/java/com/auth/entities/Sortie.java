package com.auth.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sortie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message="le titre ne doit pas etre null")
	private String titre;
	@NotNull(message="la destination ne doit pas etre null")
	private String destination;
	@NotNull(message="le depart ne doit pas etre null")
	private String depart;
	@NotNull(message="le retour ne doit pas etre null")
	private String retour;
	@NotNull(message="le champs  respensable ne doit pas etre null")
	private String respensable;
	@NotNull(message="le champs description ne doit pas etre null")
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getRetour() {
		return retour;
	}
	public void setRetour(String retour) {
		this.retour = retour;
	}
	public String getRespensable() {
		return respensable;
	}
	public void setRespensable(String respensable) {
		this.respensable = respensable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Sortie() {
		super();
	}
	public Sortie(int id, @NotNull(message = "le titre ne doit pas etre null") String titre,
			@NotNull(message = "la destination ne doit pas etre null") String destination,
			@NotNull(message = "le depart ne doit pas etre null") String depart,
			@NotNull(message = "le retour ne doit pas etre null") String retour,
			@NotNull(message = "le champs  respensable ne doit pas etre null") String respensable,
			@NotNull(message = "le champs description ne doit pas etre null") String description) {
		super();
		this.id = id;
		this.titre = titre;
		this.destination = destination;
		this.depart = depart;
		this.retour = retour;
		this.respensable = respensable;
		this.description = description;
	}
	public Sortie(@NotNull(message = "le titre ne doit pas etre null") String titre,
			@NotNull(message = "la destination ne doit pas etre null") String destination,
			@NotNull(message = "le depart ne doit pas etre null") String depart,
			@NotNull(message = "le retour ne doit pas etre null") String retour,
			@NotNull(message = "le champs  respensable ne doit pas etre null") String respensable,
			@NotNull(message = "le champs description ne doit pas etre null") String description) {
		super();
		this.titre = titre;
		this.destination = destination;
		this.depart = depart;
		this.retour = retour;
		this.respensable = respensable;
		this.description = description;
	}
	

}
