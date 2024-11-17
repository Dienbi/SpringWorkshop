package com.twin.spring_first_project.controlers;


import com.twin.spring_first_project.entities.Universite;
import com.twin.spring_first_project.services.IUniversiteService;
import com.twin.spring_first_project.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor

public class UniversiteController {
    IUniversiteService universiteService;

    @PutMapping("/add-foyer/{idFoyer}/{nomUniversite}")
    @ResponseBody
    public Universite affecterFoyerToUniversite(@PathVariable("idFoyer") long idFoyer, @PathVariable("nomUniversite") String nomUniversite) {

        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("/remove-foyer/{idFoyer}")
    @ResponseBody
    public Universite desaffecterFoyerToUniversite(@PathVariable("idFoyer") long idFoyer) {
        return universiteService.desaffecterFoyerAUniversite(idFoyer);
    }
}