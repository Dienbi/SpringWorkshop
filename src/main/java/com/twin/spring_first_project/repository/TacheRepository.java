package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Long> {
}
