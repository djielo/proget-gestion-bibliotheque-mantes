package com.bibliotheque.gestion_bibliotheque.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_emprunt")
    private int numEmprunt;

    @Column(name = "date_emprunt")
    private Date dateEmprunt;

    @Column(name = "date_retour")
    private Date dateRetour;

    @ManyToOne
    @JoinColumn(name = "num_abonne")
    private Usager usager;

    @ManyToOne
    @JoinColumn(name = "id_livre")
    private Livre livre;

    public Emprunt() {
    }

    public Emprunt(int numEmprunt, Date dateEmprunt, Date dateRetour, Usager usager, Livre livre) {
        this.numEmprunt = numEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.usager = usager;
        this.livre = livre;
    }


    public int getNumEmprunt() {
        return numEmprunt;
    }

    public void setNumEmprunt(int numEmprunt) {
        this.numEmprunt = numEmprunt;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public Usager getUsager() {
        return usager;
    }

    public void setUsager(Usager usager) {
        this.usager = usager;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "numEmprunt=" + numEmprunt +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRetour=" + dateRetour +
                ", usager=" + usager +
                ", livre=" + livre +
                '}';
    }
}
