package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.EtudiantService;
import com.twin.spring_first_project.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class EtudiantController {
    IEtudiantService etudiantService;
}
