package com.archive.services;

import java.util.List;
import java.util.Optional;

import com.archive.entities.Recommandation;

public interface RecommandationInterface {
	
	public List<Recommandation> findAll();
	public Recommandation addRecommandation(Recommandation recommandation);
	public Optional<Recommandation>  findRecommandationById(int id);
	public void deleteRecommandation(int id);

	

}
