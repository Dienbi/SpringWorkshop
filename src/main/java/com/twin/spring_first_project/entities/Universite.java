package com.twin.spring_first_project.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "universite")
public class Universite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_universite")

    private long idUniversite;
    @Column (name = "nom_universite")
    private String nomUniversite;
    @Column (name = "adresse")
    private String adresse;
    @OneToOne (mappedBy = "Universite")
    private Foyer Foyer;
}
