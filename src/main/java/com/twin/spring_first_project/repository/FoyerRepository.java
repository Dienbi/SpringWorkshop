package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Foyer;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    /*Foyer findByNomFoyer(String nomFoyer);
    Foyer findByNomFoyerAndCapaciteFoyer(String nomFoyer,Long capacite);
    List<Foyer> findByUniversiteNomUniversite(String nom);
    List<Foyer> findByBlocsNomBloc(String s);
    List<Foyer> findByUniversiteNomUniversiteAndBlocsNomBloc(String nom);
*/
}
