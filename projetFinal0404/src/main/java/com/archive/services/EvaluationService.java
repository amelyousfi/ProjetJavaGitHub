package com.archive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.entities.Evaluation;
import com.archive.repositories.EvaluationRepo;
@Service
public class EvaluationService implements EvaluationInterface{
	@Autowired
	EvaluationRepo evaluationRepo;

	@Override
	public List<Evaluation> findAll() {
		return evaluationRepo.findAll();
	}

	@Override
	public Evaluation addEvaluation(Evaluation evaluation) {
		return evaluationRepo.save(evaluation);
	}

	@Override
	public Optional<Evaluation> findEvaluationById(int id) {
		return evaluationRepo.findById(id);
	}

	@Override
	public void deleteEvaluation(int id) {
		evaluationRepo.deleteById(id);
		
	}

}
