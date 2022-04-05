package com.archive.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.archive.entities.Sortie;

public interface SortieRepo extends JpaRepository<Sortie, Integer> {
	public Page<Sortie> findAll(Pageable pageable);

}
