package tn.esprit.tic.web.springprojrct.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.web.springprojrct.entities.Chambre;
import tn.esprit.tic.web.springprojrct.entities.Etudiant;
import tn.esprit.tic.web.springprojrct.entities.Reservation;
import tn.esprit.tic.web.springprojrct.entities.TypeChambre;
import tn.esprit.tic.web.springprojrct.repositories.ChambreRepository;
import tn.esprit.tic.web.springprojrct.repositories.EtudiantRepository;
import tn.esprit.tic.web.springprojrct.repositories.ReservationRepository;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;
    ChambreRepository chambreRepository;
    EtudiantRepository etudiantRepository;

    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin) {
        return reservationRepository.findReservationsByAnneeUniversitaire(dateDebut, dateFin);
    }

   /* public Reservation ajouterReservationEtAssignerAChambreEtAEtudiant(Reservation res, Long
            numChambre, long cin) {
        Etudiant etudiant = etudiantRepository.findByCin(cin);
        List<Chambre> chambres = chambreRepository.findByNumeroChambre(numChambre);
        chambres.forEach(chambre -> {
            if (chambre.getTypeC().equals(TypeChambre.TRIPLE)) {
                Integer count = (3 - chambreRepository.findReservationCountForCurrentYearByChambreId(chambre.getIdChambre()));
            } else if (chambre.getTypeC().equals(TypeChambre.DOUBLE)) {
                Integer count = (2 - chambreRepository.findReservationCountForCurrentYearByChambreId(chambre.getIdChambre()));
            } else {
                Integer count = (1 - chambreRepository.findReservationCountForCurrentYearByChambreId(chambre.getIdChambre()));

            }
        });
        //  if(count>0){
        res.setChambre(chambres.get(0));

    }*/

}

