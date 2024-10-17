package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.IReservationService;
import com.twin.spring_first_project.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ReservationController {
    IReservationService reservationService;
}
