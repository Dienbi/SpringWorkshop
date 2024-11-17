package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByBlocNomBloc(String nomBloc);
   // List<Chambre> findByTypeCAndBlocNomBloc(String type,String nom);
  //  List<Chambre> findByReservationsEstValide(Boolean valid);
  //  List<Chambre> findByBlocNomBlocAndBlocCapaciteBloc(String nom,long capacite);
   /* @Query("select c from Chambre c where c.bloc.nomBloc=:nom")
    List<Chambre> retrieveChambreByBloc(@Param("nom")String nom);*/
    @Query("select c from Chambre c where c.typeC=:type and c.bloc.nomBloc=:nom ")
    List<Chambre> retrievechambrebytype(@Param("nom")String nom,@Param("type")String type);
    @Query("select c from Chambre c join c.reservations r where r.estValid=:valide")
    List<Chambre> retrieveChambreByValidity(@Param("valide")Boolean valide);
    @Query("select c from Chambre c where c.bloc.nomBloc=:nom and c.bloc.capaciteBloc>:nombre")
    List<Chambre> retrieveChambreByNomBlocAndCapacity(@Param("nom")String nom,@Param("nombre")long nombre);
    Chambre findByNumeroChambre(Long numChambre);


}

