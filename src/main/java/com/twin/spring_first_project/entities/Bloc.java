package com.twin.spring_first_project.entities;

import com.twin.spring_first_project.entities.Foyer;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private long idBloc;
    @Column(name="nomBloc")
    private String nomBloc;
    @Column(name="capaciteBloc")
    private long capaciteBloc;
@ManyToOne
private Foyer foyer;

    @OneToMany (mappedBy = "bloc")
    private Set<Chambre> chambres;

}