package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Universite;
import com.twin.spring_first_project.repository.UniversiteRepository;

import java.util.List;
import java.util.Optional;

public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Optional<Universite> retrieveUniversite(Long idBloc) {
        return universiteRepository.findById(idBloc);
    }

    @Override
    public void removeUniversite(Long idBloc) {
        universiteRepository.deleteById(idBloc);
    }
}
