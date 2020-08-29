package com.bibliotheque.gestion_bibliotheque.services;

import com.bibliotheque.gestion_bibliotheque.entities.Emprunt;
import com.bibliotheque.gestion_bibliotheque.entities.Livre;

import java.util.Date;
import java.util.List;

public interface EmpruntService {
    void afficherLesEmprunt();
    void restitution(int num_emprunt);
    List<Emprunt> consulterHistorique(Date date1,Date date2);
    void emprunterLivre(int idLivre);
    public Emprunt creerUnEmprint(Emprunt emprunt);
    List<Emprunt> getAllEmprunt();

}
