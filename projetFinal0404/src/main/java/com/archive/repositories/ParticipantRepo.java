package com.archive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archive.entities.Participant;

public interface ParticipantRepo extends JpaRepository<Participant, Integer> {

}
