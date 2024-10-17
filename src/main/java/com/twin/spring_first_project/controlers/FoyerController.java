package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.FoyerService;
import com.twin.spring_first_project.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class FoyerController {
    IFoyerService foyerService;
}
