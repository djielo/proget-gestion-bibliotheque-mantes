package com.bibliotheque.gestion_bibliotheque.controller;

import com.bibliotheque.gestion_bibliotheque.entities.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bibliotheque.gestion_bibliotheque.services.LivreService;

import java.util.List;

@RestController
public class LivreController {
    @Autowired
    private LivreService livreService;


    @GetMapping(value = "/livres")
    public List<Livre> getAllLivre() {
        return livreService.getAllLivre ();
    }

    @PostMapping(value = "/save/{id}")
    public Livre updateLivre(@RequestBody Livre livre) {
        return livreService.updateLivre (livre);
    }

    @PostMapping(value = "/ajout/{id}")
    public Livre ajouterUnExemplaire(@PathVariable("id") int id) {
        return livreService.ajouterUnExemplaire (id);
    }

    @PostMapping(value = "/{id}")
    public void supprimerLivre(@PathVariable("id") int id) {
        livreService.supprimerLivre (id);
    }

    @GetMapping(value = "/isb10")
    public Livre rechercherUnLivre(@RequestParam Livre livre) {
        return livreService.rechercherUnLivre (livre);
    }

    @PostMapping(value = "/creer")
    public void insererLivre(@RequestBody Livre livre) {
        livreService.insererLivre (livre);

    }
}
