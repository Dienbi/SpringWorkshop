package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.entities.Universite;
import com.twin.spring_first_project.services.BlocService;
import com.twin.spring_first_project.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")

public class BlocController {
    IBlocService blocService;
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBloc();
        return listBlocs;
    }
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }

}
