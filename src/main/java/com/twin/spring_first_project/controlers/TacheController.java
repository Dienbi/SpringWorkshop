package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.ITacheService;
import com.twin.spring_first_project.services.TacheService;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TacheController {
    ITacheService tacheService;
}
