package com.twin.spring_first_project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "tache")
public class Tache {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_tache")
    private long idTache;
    @Column(name = "date_tache")
    private LocalDate dateTache;
   @Column(name = "duree")
    private int duree;
   @Column(name = "tarif_horaire")
   private float tarifHoraire;
    @Enumerated(EnumType.STRING)
   public TypeTache typeTache;

    @ManyToOne
    private Etudiant etudiant;
    @OneToOne (mappedBy = "tache")
    private Etudiant etudiantOne;
}
