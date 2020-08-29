package com.bibliotheque.gestion_bibliotheque.services;

import com.bibliotheque.gestion_bibliotheque.dao.EmpruntRepository;
import com.bibliotheque.gestion_bibliotheque.dao.LivreRepository;
import com.bibliotheque.gestion_bibliotheque.entities.Emprunt;
import com.bibliotheque.gestion_bibliotheque.entities.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmpruntServiceImp implements EmpruntService {
    @Autowired
    EmpruntRepository empruntRepository;
    @Autowired
    LivreRepository livreRepository;
    @Override
    public void afficherLesEmprunt() {
        List<Emprunt> emprunts= empruntRepository.findAll ();
        for(Emprunt em:emprunts){
            System.out.println (em);
        }
    }

    @Override
    public void restitution(int num_emprunt) {
      Optional<Emprunt> unEmprunt= empruntRepository.findById (num_emprunt);
      if(unEmprunt.isPresent ()) {
          Livre livre1= unEmprunt.get().getLivre ();
          int nombreExemplaireLivre=livre1.getNombreExemplaire ();
          livre1.setNombreExemplaire (nombreExemplaireLivre + 1);
          livreRepository.save(livre1);
          empruntRepository.delete (unEmprunt.get ());
      }
    }
    @Override
    public List<Emprunt> consulterHistorique(Date date1, Date date2) {
        return null;
    }

    @Override
    public void emprunterLivre(int idLivre) {
        Optional<Livre> livre=livreRepository.findById (idLivre);
        if(livre.isPresent ()){
            int nombreExemplaire = livre.get ().getNombreExemplaire ();
            livre.get ().setNombreExemplaire (nombreExemplaire - 1);
            livreRepository.save (livre.get ());
        }
    }

    @Override
    public Emprunt creerUnEmprint(Emprunt emprunt) {
        return empruntRepository.save (emprunt);
    }

    @Override
    public List<Emprunt> getAllEmprunt () {
        return empruntRepository.findAll ();
    }
}
