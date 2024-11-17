package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Etudiant;
import com.twin.spring_first_project.entities.Reservation;
import com.twin.spring_first_project.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor

public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    ReservationService reservationService;
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
    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        return null;
    }


}
