package com.twin.spring_first_project.entities;

import jakarta.persistence.*;

import java.util.Set;
import com.twin.spring_first_project.entities.Bloc;
@Entity
@Table(name = "foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_foyer")
    private long idFoyer;
   @Column(name = "nom_foyer")
    private String nomFoyer;
   @Column(name = "capacite_foyer")
   private long capaciteFoyer;

    public Foyer() {
    }

    public Foyer(long idFoyer, String nomFoyer, long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }
    @OneToOne
    private Universite Universite;
    @OneToMany (mappedBy = "foyer")
    private Set<Bloc> Blocs;
}
