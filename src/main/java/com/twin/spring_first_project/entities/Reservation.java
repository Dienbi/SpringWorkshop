package com.twin.spring_first_project.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @Column(name = "id_reservation")
    private String idReservation;
   @Column(name = "date_reservation")
    private Date dateReservation;
   @Column(name = "est_valid")
   private boolean estValid;


    public Reservation() {
    }

    public Reservation(String idReservation, Date dateReservation, boolean estValid) {
        this.idReservation = idReservation;
        this.dateReservation = dateReservation;
        this.estValid = estValid;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public boolean isEstValid() {
        return estValid;
    }

    public void setEstValid(boolean estValid) {
        this.estValid = estValid;
    }
    @ManyToMany
    private Set<Etudiant> etudiants;

}
