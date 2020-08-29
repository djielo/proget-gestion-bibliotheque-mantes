package com.bibliotheque.gestion_bibliotheque.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "usager")
public class Usager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_abonne")
    private int numAbonne;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "statut")
    @Enumerated(EnumType.STRING)
    private Statut statut;

    @OneToMany(mappedBy = "usager")
    @JsonBackReference
    private List<Emprunt> emprunts = new ArrayList<> ();

    public Usager() {
    }

    public Usager(int numAbonne, String nom, String prenom, Statut statut) {
        this.numAbonne = numAbonne;
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;
    }

    public int getNumAbonne() {
        return numAbonne;
    }

    public void setNumAbonne(int numAbonne) {
        this.numAbonne = numAbonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Usager{" +
                "numAbonne=" + numAbonne +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", statut=" + statut +
                '}';
    }
}
