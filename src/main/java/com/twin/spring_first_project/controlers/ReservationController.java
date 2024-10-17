package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.IReservationService;
import com.twin.spring_first_project.services.ReservationService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReservationController {
    IReservationService reservationService;
}
