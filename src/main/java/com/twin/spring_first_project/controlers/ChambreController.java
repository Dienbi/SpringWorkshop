package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.ChambreService;
import com.twin.spring_first_project.services.IChambreService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ChambreController {
    IChambreService chambreService;
}
