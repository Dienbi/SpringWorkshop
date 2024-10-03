package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Bloc;
import com.twin.spring_first_project.repository.BlocRepository;

import java.util.List;
import java.util.Optional;

public class BlocServide implements IBlocService{
    BlocRepository blocRepository;
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
}
