package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Chambre;
import com.twin.spring_first_project.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
// @Query("select u from Universite u where u.nomUniversite=:nomUniversite")
 //List<Universite> retrieveuniversitybynom(@Param("nomUniversite") String nomUniversite);

Universite findByNomUniversite(String nomUniversite);
}
