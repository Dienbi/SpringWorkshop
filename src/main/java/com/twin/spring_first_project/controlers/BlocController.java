package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.services.BlocService;
import com.twin.spring_first_project.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BlocController {
    IBlocService blocService;
}
