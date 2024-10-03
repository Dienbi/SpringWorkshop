package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BlocRepository extends JpaRepository<Bloc,Long> {

}
