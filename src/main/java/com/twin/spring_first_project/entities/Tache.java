package com.twin.spring_first_project.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
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

    public Tache() {
    }

    public Tache(long idTache, int duree, float tarifHoraire, TypeTache typeTache) {
        this.idTache = idTache;
        this.duree = duree;
        this.tarifHoraire = tarifHoraire;
        this.typeTache = typeTache;
    }

    public long getIdTache() {
        return idTache;
    }

    public void setIdTache(long idTache) {
        this.idTache = idTache;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public float getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(float tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public TypeTache getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(TypeTache typeTache) {
        this.typeTache = typeTache;
    }
    @ManyToOne
    private Etudiant etudiant;
    @OneToOne (mappedBy = "tache")
    private Etudiant etudiantOne;
}
