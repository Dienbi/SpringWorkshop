package com.twin.spring_first_project.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
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

    public Etudiant() {
    }

    public Etudiant(long idEtudiant, String nomEt, String prenomEt, long cin, String ecol, Date dateNaissance, TypeEtudiant typeE) {
        this.idEtudiant = idEtudiant;
        this.nomEt = nomEt;
        this.prenomEt = prenomEt;
        this.cin = cin;
        this.ecol = ecol;
        this.dateNaissance = dateNaissance;
        this.typeE=typeE;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getEcol() {
        return ecol;
    }

    public void setEcol(String ecol) {
        this.ecol = ecol;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public TypeEtudiant getTypeE() {
        return typeE;
    }

    public void setTypeE(TypeEtudiant typeE) {
        this.typeE = typeE;
    }

    @ManyToMany (mappedBy = "etudiants")
    private Set<Reservation> reservations;
    @OneToMany (mappedBy = "etudiant")
    private Set<Tache>taches;
    @OneToOne
    private Tache tache;
}
