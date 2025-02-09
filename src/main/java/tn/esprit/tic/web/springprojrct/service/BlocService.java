package tn.esprit.tic.web.springprojrct.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.web.springprojrct.entities.Bloc;
import tn.esprit.tic.web.springprojrct.entities.Chambre;
import tn.esprit.tic.web.springprojrct.entities.TypeChambre;
import tn.esprit.tic.web.springprojrct.repositories.BlocRepository;
import tn.esprit.tic.web.springprojrct.repositories.ChambreRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocService  implements IBlocService {
    BlocRepository br;
    ChambreRepository chambreRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return br.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return br.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return br.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return br.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        br.deleteById(idBloc);
    }

    @Override
    public List<Bloc> findByFoyerUniversiteNomUniversite(String universite) {
        return br.findByFoyerUniversiteNomUniversite(universite);
    }

    @Override
    public List<Bloc> retrieveBlocByUniversite(String nom) {
        return br.retrieveBlocByUniversite(nom);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = br.findBlocByNomBloc(nomBloc);
        List<Chambre> chambres = chambreRepository.findByNumeroChambreIn(numChambre);
        for (Chambre chambre : chambres) {
            chambre.setBloc(bloc);
        }
        chambreRepository.saveAll(chambres);
        return bloc;
    }

    @Override
    public void checkAndReassignChambres() {
        List<Bloc> blocs = br.findAll();

        for (Bloc bloc : blocs) {
            long totalSize = bloc.getChambres().stream()
                    .mapToLong(chambre -> {
                        switch (chambre.getTypeC()) {
                            case SIMPLE:
                                return 1;
                            case DOUBLE:
                                return 2;
                            case TRIPLE:
                                return 3;
                            default:
                                return 0;
                        }
                    }).sum();

            if (totalSize > bloc.getCapaciteBloc()) {
                List<Chambre> chambresToReassign = bloc.getChambres().stream()
                        .sorted((c1, c2) -> {
                            int size1 = getSize(c1.getTypeC());
                            int size2 = getSize(c2.getTypeC());
                            return Integer.compare(size2, size1);
                        })
                        .toList();

                for (Chambre chambre : chambresToReassign) {
                    if (totalSize <= bloc.getCapaciteBloc()) {
                        break;
                    }
                    Bloc availableBloc = findAvailableBloc(blocs);
                    if (availableBloc != null) {
                        chambre.setBloc(availableBloc);
                        chambreRepository.save(chambre);
                        totalSize -= getSize(chambre.getTypeC());
                    }
                }
            }
        }
    }

    @Override
    public Bloc findAvailableBloc(List<Bloc> blocs) {
        for (Bloc bloc : blocs) {
            if (bloc.getChambres().size() < bloc.getCapaciteBloc()) {
                return bloc;
            }
        }
        return null;
    }

    private int getSize(TypeChambre type) {
        switch (type) {
            case SIMPLE:
                return 1;
            case DOUBLE:
                return 2;
            case TRIPLE:
                return 3;
            default:
                return 0;
        }
    }
}
