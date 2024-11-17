package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();
    Universite updateUniversite(Universite u);
    Optional<Universite> retrieveUniversite(Long idBloc);
    void removeUniversite(Long idBloc);
     Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);
     Universite desaffecterFoyerAUniversite (long idFoyer) ;

}
