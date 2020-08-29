package com.bibliotheque.gestion_bibliotheque.services;

import com.bibliotheque.gestion_bibliotheque.dao.LivreRepository;
import com.bibliotheque.gestion_bibliotheque.entities.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LivreServiceImpl implements LivreService {
   @Autowired
    LivreRepository livreRepository;

    @Override
    public List<Livre> getAllLivre() {
        return livreRepository.findAll ();
    }

    @Override
    public Livre updateLivre(Livre livre) {
        return livreRepository.save (livre);
    }

    @Override
    public Livre ajouterUnExemplaire(int id) {
      Optional<Livre> livre= livreRepository.findById (id);
      if(livre.isPresent ()) {
          livre.get ().setNombreExemplaire (livre.get ().getNombreExemplaire () + 1);
          livreRepository.save (livre.get ());
      }
      return livre.get ();
    }
    @Override
    public void supprimerLivre(int id) {
        Optional<Livre> livre = livreRepository.findById (id);
    if(livre.isPresent ()){
        livreRepository.deleteById (id);
    }else{
        System.out.println ("le livre n existe pas");
    }

    }

    @Override
    public Livre rechercherUnLivre(Livre livre) {
        Livre resultat=null;
        int idLivre = livre.getId ();
        Optional<Livre> livreChercher = livreRepository.findById (idLivre);
        if(livreChercher.isPresent ()) {
            resultat = livreChercher.get ();
        }
        return resultat;
    }

    @Override
    public void insererLivre(Livre livre) {
        livreRepository.save (livre);
    }
    }




