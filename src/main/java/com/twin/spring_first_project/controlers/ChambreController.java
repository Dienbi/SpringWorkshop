package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.ChambreService;
import com.twin.spring_first_project.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class ChambreController {
    IChambreService chambreService;
}
