package com.archive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.archive.entities.Sortie;
import com.archive.repositories.SortieRepo;
@Service
public class SortieService implements SortieInterface {
@Autowired
SortieRepo sortieRepo;
	@Override
	public List<Sortie> findAll() {
		// TODO Auto-generated method stub
		return sortieRepo.findAll();	}

	@Override
	public Sortie addSortie(Sortie sortie) {
		// TODO Auto-generated method stub
		return sortieRepo.save(sortie);
	}

	@Override
	public Optional<Sortie> findSortieById(int id) {
		// TODO Auto-generated method stub
		return sortieRepo.findById(id);
	}

	@Override
	public void deleteSortie(int id) {
		// TODO Auto-generated method stub
		sortieRepo.deleteById(id);
		
	}

	@Override
	public Page<Sortie> findAllTriee(Pageable pageable) {
		// TODO Auto-generated method stub
		return sortieRepo.findAll(pageable);
	}

}
