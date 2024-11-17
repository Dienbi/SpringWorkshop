package com.twin.spring_first_project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chambre")
    private long idChambre;
    @Column(name = "numero_chambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;


    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;
}
