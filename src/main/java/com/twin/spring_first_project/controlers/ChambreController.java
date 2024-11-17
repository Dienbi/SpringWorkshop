package com.twin.spring_first_project.controlers;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.entities.Chambre;
import com.twin.spring_first_project.entities.Etudiant;
import com.twin.spring_first_project.repository.ChambreRepository;
import com.twin.spring_first_project.services.ChambreService;
import com.twin.spring_first_project.services.IBlocService;
import com.twin.spring_first_project.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")

public class ChambreController {
    IChambreService chambreService;
    IBlocService blocService;
    // http://localhost:8089/foyer/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambre();
        return listChambres;
    }
    // http://localhost:8089/foyer/etudiant/add-etudiant
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/foyer/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Optional<Chambre> retrieveChambre(@PathVariable("chambre-id") Long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }
    // http://localhost:8089/foyer/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long idChambre) {
        chambreService.removeChambre(idChambre);
    }
    // http://localhost:8089/foyer/etudiant/update-etudiant
    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre= chambreService.updateChambre(c);
        return chambre;
    }
    @GetMapping("/retrieve-chambre-by-bloc/{nom-bloc}")
    public List<Chambre> retrieveChambreByBloc(@PathVariable("nom-bloc") String nom) {
        return chambreService.retrieveChambreByBloc(nom);
    }
    @GetMapping("/retrieve-chambre-by-type/{nom-bloc}/{type}")
    public List<Chambre> retrievechambrebytype(@PathVariable("nom-bloc") String nom,@PathVariable("type") String type) {
        return chambreService.retrievechambrebytype(nom,type);
    }
    @GetMapping("/retrieve-chambre-by-validity/{valide}")
    public List<Chambre> retrieveChambreByValidity(@PathVariable("valide") Boolean valide) {
        return chambreService.retrieveChambreByValidity(valide);
    }

    @GetMapping("/retrieve-chambre-by-nom-bloc-and-capacity/{nom-bloc}/{capacity}")
    public List<Chambre> retrieveChambreByNomBlocAndCapacity(@PathVariable("nom-bloc") String nom, @PathVariable("capacity") long capacity) {
        return chambreService.retrieveChambreByNomBlocAndCapacity(nom, capacity);
    }
    @PutMapping("/affecterBloc/{numChambre}/{nomBloc}")
    @ResponseBody
    public List<Chambre> affecterBlocAuxChambres(@PathVariable("numChambre") List<Long> numChambre, @PathVariable("nomBloc") String nomBloc) {
        return chambreService.affecterBlocAuxChambres(nomBloc,numChambre);
    }

}
