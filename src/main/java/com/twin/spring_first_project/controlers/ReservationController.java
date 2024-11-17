package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.entities.Reservation;
import com.twin.spring_first_project.services.IReservationService;
import com.twin.spring_first_project.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")

public class ReservationController {
    IReservationService reservationService;
    @GetMapping ("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservation();
    }
    @PostMapping ("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservation(r);
        return reservation;
    }
}
