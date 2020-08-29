package com.bibliotheque.gestion_bibliotheque.controller;

import com.bibliotheque.gestion_bibliotheque.entities.Statut;
import com.bibliotheque.gestion_bibliotheque.entities.Usager;
import com.bibliotheque.gestion_bibliotheque.services.UsagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsagerController {
    @Autowired
    private UsagerService usagerService;
    @GetMapping(value = "/usager")
    public List<Usager> findAllUsager(){
        return usagerService.findAllUsager ();
    }
    @PostMapping(value = "/{num_abonne}")
    public  void supprimerUsager(@PathVariable("num_abonne") int idUsager){
        usagerService.supprimerUsager (idUsager);

    }
    @GetMapping(value = "/search/{id}")
    public Usager rechergerUsager(Usager usager){
       return usagerService.rechergerUsager (usager);

    }
    @PostMapping(value = "/add")
    public   Usager insererNouveauUsager(@RequestBody Usager usager){
        return  usagerService.insererNouveauUsager (usager);

    }
    @PostMapping(value = "/mus")
    public Usager ModificationUsager(@RequestBody Usager usager){
        return usagerService.ModificationUsager (usager);
    }
}
