package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
