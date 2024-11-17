package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.entities.Chambre;
import com.twin.spring_first_project.repository.BlocRepository;
import com.twin.spring_first_project.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
@AllArgsConstructor

public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
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
    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    @Override
    public List<Chambre> retrieveChambreByBloc(String nom) {
        return chambreRepository.findByBlocNomBloc(nom);
    }
    @Override
    public List<Chambre> retrievechambrebytype(String nom, String type) {
        return chambreRepository.retrievechambrebytype(nom,type);
    }
    @Override
    public List<Chambre> retrieveChambreByValidity(Boolean valide) {
        return chambreRepository.retrieveChambreByValidity(valide);
    }
    @Override
    public List<Chambre> retrieveChambreByNomBlocAndCapacity(String nom, long nombre) {
        return chambreRepository.retrieveChambreByNomBlocAndCapacity(nom,nombre);
    }
    @Override
    public List<Chambre> affecterBlocAuxChambres(String nomBloc, List<Long> numChambre) {
        // Retrieve the bloc by name and check if it exists
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        if (bloc == null) {
            throw new NoSuchElementException("Bloc with name " + nomBloc + " not found");
        }

        // Update each chambre's bloc reference
        List<Chambre> updatedChambres = new ArrayList<>();
        for (Long num : numChambre) {
            Chambre chambre = chambreRepository.findById(num)
                    .orElseThrow(() -> new NoSuchElementException("Chambre with ID " + num + " not found"));

            // Set the bloc to the chambre
            chambre.setBloc(bloc);
            updatedChambres.add(chambreRepository.save(chambre)); // Save the updated chambre
        }

        return updatedChambres; // Return the list of updated chambres
    }

}
