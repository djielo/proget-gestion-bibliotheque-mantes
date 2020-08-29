package com.bibliotheque.gestion_bibliotheque.dao;

import com.bibliotheque.gestion_bibliotheque.entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt,Integer> {
}
