package com.archive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.archive.entities.Sortie;



public interface SortieInterface {
	public List<Sortie> findAll();
	public Sortie addSortie(Sortie sortie);
	public Optional<Sortie>  findSortieById(int id);
	public void deleteSortie(int id);
	public Page<Sortie> findAllTriee(Pageable pageable);

}
