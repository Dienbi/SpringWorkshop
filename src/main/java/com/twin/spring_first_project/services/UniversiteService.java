package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Foyer;
import com.twin.spring_first_project.entities.Universite;
import com.twin.spring_first_project.repository.FoyerRepository;
import com.twin.spring_first_project.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    FoyerService    foyerService;
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
        @Override
        public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite){
            Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
            Foyer foyer = foyerService.retrieveFoyer(idFoyer);
            foyer.setUniversite(universite);
            foyerRepository.save(foyer);
            return universite;

        }
        @Override
        public Universite desaffecterFoyerAUniversite (long idFoyer) {
            Foyer foyer = foyerService.retrieveFoyer(idFoyer);
            foyer.setUniversite(null);
            foyerRepository.save(foyer);
            return foyer.getUniversite();
        }

}
