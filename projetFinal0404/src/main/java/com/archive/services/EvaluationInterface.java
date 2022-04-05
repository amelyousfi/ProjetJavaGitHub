package com.archive.services;

import java.util.List;
import java.util.Optional;

import com.archive.entities.Evaluation;

public interface EvaluationInterface  {
	public List<Evaluation> findAll();
	public Evaluation addEvaluation(Evaluation evaluation);
	public Optional<Evaluation> findEvaluationById(int id);
	public void deleteEvaluation(int id);

}
