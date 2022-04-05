package com.archive.services;

import java.util.List;
import java.util.Optional;

import com.archive.entities.Participant;


public interface ParticipantInterface {
	public List<Participant> findAll();
	public Participant addParticipant(Participant participant);
	public Optional<Participant> findParticipantById(int id);
	public void deleteParticipant(int id);

}
