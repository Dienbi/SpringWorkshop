package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiant();
    Etudiant updateEtudiant(Etudiant e);
    Optional<Etudiant> retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);

    Etudiant addEtudiant(Etudiant e);
    Etudiant affecterEtudiantAReservation (String nomEt, String prenomEt, String idReservation) ;

}
