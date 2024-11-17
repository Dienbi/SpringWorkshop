package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.entities.Chambre;
import com.twin.spring_first_project.repository.BlocRepository;
import com.twin.spring_first_project.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService{
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll() ;
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Optional<Bloc> retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }




}


