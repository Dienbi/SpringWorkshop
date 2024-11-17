package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

    //List<Bloc> findByFoyerUniversiteNomUniversite(String nom);
    Bloc findByNomBloc(String nomBloc);


}
