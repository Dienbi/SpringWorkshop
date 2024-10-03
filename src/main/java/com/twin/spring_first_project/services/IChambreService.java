package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {
    List<Chambre> retrieveAllChambre();
    Chambre updateChambre(Chambre c);
    Optional<Chambre> retrieveChambre(Long idChambre);
    void removeChambre(Long idChambre);
}
