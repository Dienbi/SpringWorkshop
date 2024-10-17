package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.ITacheService;
import com.twin.spring_first_project.services.TacheService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class TacheController {
    ITacheService tacheService;
}
