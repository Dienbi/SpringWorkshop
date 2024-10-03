package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByNomFoyer(String nomFoyer);
    Foyer findByNomFoyerAndCapaciteFoyer(String nomFoyer,Long capacite);
}
