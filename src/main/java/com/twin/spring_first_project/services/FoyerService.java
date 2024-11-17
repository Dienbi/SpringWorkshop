package com.twin.spring_first_project.services;

import com.twin.spring_first_project.entities.Foyer;
import com.twin.spring_first_project.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class FoyerService implements IFoyerService{
    FoyerRepository   foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyer() {
        return foyerRepository.findAll();
    }
    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }



    @Override
    public Object updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

        @Override
        public Foyer retrieveFoyer(Long idFoyer) {
            return foyerRepository.findById(idFoyer).orElse(null);
        }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
