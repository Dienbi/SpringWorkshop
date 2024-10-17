package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.BlocService;
import com.twin.spring_first_project.services.IBlocService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlocController {
    IBlocService blocService;
}
