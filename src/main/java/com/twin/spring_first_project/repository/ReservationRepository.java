package com.twin.spring_first_project.repository;

import com.twin.spring_first_project.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
