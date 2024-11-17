package com.twin.spring_first_project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant")
    private long idEtudiant;
    @Column(name = "nom_etudiant")
    private String nomEt;
    @Column(name = "prenom_etudiant")
    private String prenomEt;
    @Column(name = "cin")
    private long cin;
    @Column(name = "ecole")
    private String ecol;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private TypeEtudiant typeE;


    @ManyToMany (mappedBy = "etudiants")
    private Set<Reservation> reservations;
    @OneToMany (mappedBy = "etudiant")
    private Set<Tache>taches;
    @OneToOne
    private Tache tache;
}
