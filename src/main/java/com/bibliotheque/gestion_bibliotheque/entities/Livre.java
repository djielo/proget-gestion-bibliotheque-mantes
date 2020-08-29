package com.bibliotheque.gestion_bibliotheque.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private   int   id;
    @Column(name = "isb10")
    private int isb10;
    @Column(name = "isb13")
    private int isb13;
    @Column(name = "nombre_exemplaire")
    private int nombreExemplaire=0;

    @OneToMany(mappedBy ="livre")
    @JsonBackReference
    List<Emprunt> empruntList = new ArrayList<> ();

    public Livre(int id, int isbn10, int isb13,int nombreExemplaire) {
        this.id = id;
        this.isb10 = isbn10;
        this.isb13 = isb13;
        this.nombreExemplaire = nombreExemplaire;
    }

    public Livre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn10() {
        return isb10;
    }

    public void setIsbn10(int isbn10) {
        this.isb10 = isb10;
    }

    public int getisb13() {
        return isb13;
    }

    public void setisb13(int isb13) {
        this.isb13 = isb13;
    }

    public List<Emprunt> getEmpruntList() {
        return empruntList;
    }

    public void setEmpruntList(List<Emprunt> empruntList) {
        this.empruntList = empruntList;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public void setNombreExemplaire(int nombreExemplaire) {
        this.nombreExemplaire = nombreExemplaire;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", isbn10=" + isb10 +
                ", isb13=" + isb13 +
                '}';
    }
}
