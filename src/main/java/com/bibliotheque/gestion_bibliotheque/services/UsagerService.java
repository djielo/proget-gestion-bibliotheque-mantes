package com.bibliotheque.gestion_bibliotheque.services;

import com.bibliotheque.gestion_bibliotheque.entities.Statut;
import com.bibliotheque.gestion_bibliotheque.entities.Usager;

import java.util.List;

public interface UsagerService {
    public List<Usager> findAllUsager();
   public Usager ModificationUsager(Usager usager);
  public   void supprimerUsager(int idUsager);
   public Usager rechergerUsager(Usager usager);
  public   Usager insererNouveauUsager(Usager usager);

}
