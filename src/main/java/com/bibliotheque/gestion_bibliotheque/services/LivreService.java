package com.bibliotheque.gestion_bibliotheque.services;

import com.bibliotheque.gestion_bibliotheque.entities.Livre;

import java.util.List;

public interface LivreService {
    List<Livre> getAllLivre();
    Livre updateLivre(Livre livre);
    Livre ajouterUnExemplaire(int id);
   void supprimerLivre (int id);
    Livre rechercherUnLivre(Livre livre);
    void insererLivre(Livre livre);


}
