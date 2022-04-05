package com.archive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.entities.Recommandation;
import com.archive.repositories.RecommandationRepo;

@Service
public class RecommandationService implements RecommandationInterface {
@Autowired
RecommandationRepo recommandationRepo;
	@Override
	public List<Recommandation> findAll() {
		return recommandationRepo.findAll();
	}
	@Override
	public Recommandation addRecommandation(Recommandation recommandation) {
		// TODO Auto-generated method stub
		return recommandationRepo.save(recommandation);
	}

	@Override
	public Optional<Recommandation> findRecommandationById(int id) {
		return recommandationRepo.findById(id);
	}

	@Override
	public void deleteRecommandation(int id) {
		recommandationRepo.deleteById(id);
		
	}

}
