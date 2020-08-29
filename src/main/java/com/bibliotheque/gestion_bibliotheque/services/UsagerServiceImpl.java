package com.bibliotheque.gestion_bibliotheque.services;

import com.bibliotheque.gestion_bibliotheque.dao.UsagerRepository;
import com.bibliotheque.gestion_bibliotheque.entities.Statut;
import com.bibliotheque.gestion_bibliotheque.entities.Usager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UsagerServiceImpl implements UsagerService {
    @Autowired
private UsagerRepository usagerRepository;
    @Override
    public List<Usager> findAllUsager() {
        return usagerRepository.findAll ();
    }

    @Override
    public Usager ModificationUsager(Usager usager) {
        Usager resultat = null;
        int idUser= usager.getNumAbonne ();
        Optional<Usager>  usager1 = usagerRepository.findById (idUser);
        if(usager1.isPresent ()){
            usagerRepository.save (usager);
            resultat = usager1.get ();
        }
       return resultat;

    }

    @Override
    public void supprimerUsager(int idUsager) {
       usagerRepository.deleteById (idUsager);
    }

    @Override
    public Usager rechergerUsager(Usager usager) {
        Usager resultat= null;
        int idUsager = usager.getNumAbonne ();
        Optional<Usager> usager1 = usagerRepository.findById (idUsager);
        if(usager1.isPresent ()){
            resultat = usager1.get ();
        }
        return resultat;
    }

    @Override
    public Usager insererNouveauUsager(Usager usager) {
        return usagerRepository.save (usager);
    }

}
