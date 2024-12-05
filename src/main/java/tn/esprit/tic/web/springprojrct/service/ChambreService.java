package tn.esprit.tic.web.springprojrct.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.web.springprojrct.entities.Bloc;
import tn.esprit.tic.web.springprojrct.entities.Chambre;
import tn.esprit.tic.web.springprojrct.entities.TypeChambre;
import tn.esprit.tic.web.springprojrct.repositories.BlocRepository;
import tn.esprit.tic.web.springprojrct.repositories.ChambreRepository;

import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@Service
@Slf4j
public class ChambreService implements IChambreService {

    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
    @Override
    public List<Chambre> retrieveAmmChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre ch) {
        return chambreRepository.save(ch);
    }

    @Override
    public Chambre updateChambre(Chambre ch) {
        return chambreRepository.save(ch);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public void removeChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> findByNomBloc(String nomBloc, TypeChambre typeC) {
        return chambreRepository.findByNomBloc(nomBloc, typeC);
    }

    @Override
    public List<Chambre> findByBlocNomBlocAndTypeC(String nom, TypeChambre D) {
        return chambreRepository.findByBlocNomBlocAndTypeC(nom, D);
    }

    @Override
    public List<Chambre> findByReservationsEstValide(Boolean valid) {
        return chambreRepository.findByReservationsEstValide(valid);
    }

    @Override
    public List<Chambre> findByBlocIdBlocAndBlocCapaciteBlocGreaterThan(Long blocId, Long capacity) {
        return chambreRepository.findByBlocIdBlocAndBlocCapaciteBlocGreaterThan(blocId, capacity);
    }

    @Override
    public List<Chambre> retrieveChambresByNomBLocAndCapacite(Long capacite, String nom) {
        return chambreRepository.retrieveChambresByNomBLocAndCapacite(capacite, nom);
    }

    @Override
    public List<Chambre> retrieveChambresByReservation(Boolean valid) {
        return chambreRepository.retrieveChambresByReservation(valid);
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        return chambreRepository.countChambresByTypeAndBloc(type, idBloc);
    }

    @Scheduled(fixedRate = 60000)
    @Override
    public void listeChambreParBloc() {

        List<Bloc>blocs=blocRepository.findAll();
        blocs.forEach(bloc -> {
            log.info(bloc.getNomBloc()+"ayant capacité "+bloc.getCapaciteBloc());
            log.info("liste des chambre du bloc "+bloc.getNomBloc());

            bloc.getChambres().forEach(chambre -> {
                log.info("chabmbre numero "+chambre.getNumeroChambre()+" de type "+chambre.getTypeC());
            });

        });


    }
    @Scheduled(fixedRate = 60000)
    @Override
    public void pourcentageChambreParTypeChambre() {
        Integer nbTotalDesChambres=chambreRepository.findAll().size();
        log.info("nombre des chambres"+nbTotalDesChambres);
        Arrays.stream(TypeChambre.values()).forEach(typeChambre -> {
            Integer nbChambreParType=chambreRepository.nbChambreParType(typeChambre);
            Double PourcentageParType=(nbChambreParType.doubleValue()/nbTotalDesChambres)*100;
            log.info("le pourcentage des chambres par type : "+typeChambre+" est "+PourcentageParType);
        });

    }
  /*  @Scheduled(fixedRate = 60000)
    @Override
    public void nbPlacesDisponiblesParChambreAnneeEnCours(){
        List<Chambre> chambres=chambreRepository.findAll();
        chambres.forEach(chambre -> {
            if (chambre.getTypeC().equals(TypeChambre.SIMPLE)){
                log.info("chambre numero "+chambre.getNumeroChambre()+" ayant "+(chambre.getReservations().size()-1)+" places disponibles");
            }
            log.info("chambre numero "+chambre.getNumeroChambre()+" ayant "+chambre.getReservations().size()+" reservations");
        });
    }*/
    @Scheduled(fixedRate = 60000)
    @Override
    public void nbPlacesDisponiblesParChambreAnneeEnCours() {
        List<Chambre>chambres=chambreRepository.findAll();
        chambres.forEach(chambre -> {
            if (chambre.getTypeC().equals(TypeChambre.TRIPLE)){
                log.info("les restante en 2024 pour la chambre"+chambre.getNumeroChambre()+" est egale a "
                        +(3-chambreRepository.findReservationCountForCurrentYearByChambreId(chambre.getIdChambre())));}
            else if (chambre.getTypeC().equals(TypeChambre.DOUBLE)) {
                log.info("les restante en 2024 pour la chambre"+chambre.getNumeroChambre()+" est egale a "
                        +(2-chambreRepository.findReservationCountForCurrentYearByChambreId(chambre.getIdChambre())));}
            else log.info("les restante en 2024 pour la chambre"+chambre.getNumeroChambre()+" est egale a "
                        +(1-chambreRepository.findReservationCountForCurrentYearByChambreId(chambre.getIdChambre())));


        });
}

}

