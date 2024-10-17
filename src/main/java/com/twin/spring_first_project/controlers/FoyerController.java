package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.FoyerService;
import com.twin.spring_first_project.services.IFoyerService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FoyerController {
    IFoyerService foyerService;
}
