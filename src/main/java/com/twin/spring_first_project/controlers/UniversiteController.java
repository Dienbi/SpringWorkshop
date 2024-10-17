package com.twin.spring_first_project.controlers;


import com.twin.spring_first_project.services.IUniversiteService;
import com.twin.spring_first_project.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class UniversiteController {
    IUniversiteService universiteService;
}
