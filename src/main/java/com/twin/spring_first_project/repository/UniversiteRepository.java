package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
