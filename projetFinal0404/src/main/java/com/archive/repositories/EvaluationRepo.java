package com.archive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archive.entities.Evaluation;

public interface EvaluationRepo extends JpaRepository<Evaluation, Integer> {

}
