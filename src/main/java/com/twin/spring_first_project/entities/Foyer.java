package com.twin.spring_first_project.entities;

import jakarta.persistence.*;

import java.util.Set;
import com.twin.spring_first_project.entities.Bloc;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
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


    @OneToOne
    private Universite Universite;
    @OneToMany (mappedBy = "foyer")
    private Set<Bloc> Blocs;
}
