package com.archive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archive.entities.Recommandation;

public interface RecommandationRepo extends JpaRepository<Recommandation, Integer> {

}
