package com.twin.spring_first_project.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
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

    public Chambre() {
    }

    public Chambre(long idChambre, long numeroChambre, TypeChambre typeC) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.typeC = typeC;
    }

    public long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;
}
