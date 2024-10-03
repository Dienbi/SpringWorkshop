package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Object addFoyer(Foyer f);
    List <Foyer> retrieveAllFoyer();
    Object updateFoyer(Foyer f);
    Object retrieveFoyer(Long idFoyer);
    void removeFoyer(Long idFoyer);
}
