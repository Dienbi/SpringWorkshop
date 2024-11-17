package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.entities.Etudiant;
import com.twin.spring_first_project.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    // http://localhost:8089/foyer/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiant();
        return listEtudiants;
    }
    // http://localhost:8089/foyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:8089/foyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Optional<Etudiant> retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }
    // http://localhost:8089/foyer/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
    // http://localhost:8089/foyer/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }

}
