package com.bibliotheque.gestion_bibliotheque.controller;

import com.bibliotheque.gestion_bibliotheque.entities.Emprunt;
import com.bibliotheque.gestion_bibliotheque.entities.Livre;
import com.bibliotheque.gestion_bibliotheque.services.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmprintController {
    @Autowired
    private EmpruntService empruntService;
    @GetMapping(value = "/emprunt/afficher")
    public void afficherLesEmprunt(){
        empruntService.afficherLesEmprunt ();
    }
    @PostMapping(value = "/emprunt/{num_emprunt}")
    void restitution(@PathVariable("num_emprunt") int num_emprunt){
         empruntService.restitution (num_emprunt);
    }
    @PostMapping(value = "emprunt/{idLivre")
    void emprunterLivre(@PathVariable("idLivre") int idLivre){
         empruntService.emprunterLivre (idLivre);
    }
    @PostMapping(value = "/emprunt/creer")
    public Emprunt creerUnEmprint(@RequestBody Emprunt emprunt){
        return null ;//empruntService.creerUnEmprint (emprunt);
    }
    @GetMapping(value = "/emprunt/all")
    public List<Emprunt> getAllEmprunt(){
        return empruntService.getAllEmprunt ();

    }
}
