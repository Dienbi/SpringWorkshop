package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation(Reservation r);
    Optional<Reservation> retrieveReservation(Long idReservation);
    void removeReservation(Long idReservation);
}
