package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Chambre;
import com.twin.spring_first_project.repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Optional<Chambre> retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre);
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
