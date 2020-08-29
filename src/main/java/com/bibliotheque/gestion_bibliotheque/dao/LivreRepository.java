package com.bibliotheque.gestion_bibliotheque.dao;

import com.bibliotheque.gestion_bibliotheque.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository <Livre, Integer>{
}
