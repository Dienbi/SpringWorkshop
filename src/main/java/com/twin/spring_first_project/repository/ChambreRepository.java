package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocNomBloc(String nomBloc);
}
