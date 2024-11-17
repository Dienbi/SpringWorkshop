package com.twin.spring_first_project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "reservation")
public class Reservation {
    @Id
    @Column(name = "id_reservation")
    private String idReservation;
   @Column(name = "date_reservation")
    private Date dateReservation;
   @Column(name = "est_valid")
   private boolean estValid;



    @ManyToMany
    private Set<Etudiant> etudiants;

}
