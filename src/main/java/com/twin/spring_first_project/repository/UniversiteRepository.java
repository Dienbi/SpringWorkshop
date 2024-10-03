package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
