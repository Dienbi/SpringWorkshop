package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Etudiant;
import com.twin.spring_first_project.repository.EtudiantRepository;

import java.util.List;
import java.util.Optional;

public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Optional<Etudiant> retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
