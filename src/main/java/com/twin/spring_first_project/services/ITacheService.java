package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Tache;

import java.util.List;
import java.util.Optional;

public interface ITacheService {
    List<Tache> retrieveAllTache();
    Tache updateTache(Tache t);
    Optional<Tache> retrievetache(Long idTache);
    void removeTache(Long idTache);
}
