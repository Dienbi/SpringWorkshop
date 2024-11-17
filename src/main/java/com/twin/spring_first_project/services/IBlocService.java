package com.twin.spring_first_project.services;


import com.twin.spring_first_project.entities.Bloc;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IBlocService {
    List<Bloc> retrieveAllBloc();
    Bloc updateBloc(Bloc b);
    Optional<Bloc> retrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);

    Bloc addBloc(Bloc b);

}
