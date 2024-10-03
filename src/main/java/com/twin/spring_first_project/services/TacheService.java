package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Tache;
import com.twin.spring_first_project.repository.TacheRepository;

import java.util.List;
import java.util.Optional;

public class TacheService implements ITacheService{
    TacheRepository tacheRepository;
    @Override
    public List<Tache> retrieveAllTache() {
        return tacheRepository.findAll();
    }

    @Override
    public Tache updateTache(Tache t) {
        return tacheRepository.save(t);
    }

    @Override
    public Optional<Tache> retrievetache(Long idTache) {
        return tacheRepository.findById(idTache);
    }

    @Override
    public void removeTache(Long idTache) {
        tacheRepository.deleteById(idTache);
    }
}
