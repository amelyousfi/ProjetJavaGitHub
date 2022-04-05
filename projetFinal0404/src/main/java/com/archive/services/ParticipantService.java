package com.archive.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.entities.Participant;
import com.archive.repositories.ParticipantRepo;
@Service
public class ParticipantService implements ParticipantInterface {
@Autowired
ParticipantRepo participantrepo;
	@Override
	public List<Participant> findAll() {
		
		return participantrepo.findAll();
	}

	@Override
	public Participant addParticipant(Participant participant) {
		return participantrepo.save(participant);
	}

	@Override
	public Optional<Participant> findParticipantById(int id) {
		 return participantrepo.findById(id);
	}

	@Override
	public void deleteParticipant(int id) {
		participantrepo.deleteById(id);
		
		
	}

}
