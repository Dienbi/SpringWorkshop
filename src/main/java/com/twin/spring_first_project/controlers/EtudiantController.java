package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.EtudiantService;
import com.twin.spring_first_project.services.IEtudiantService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EtudiantController {
    IEtudiantService etudiantService;
}
