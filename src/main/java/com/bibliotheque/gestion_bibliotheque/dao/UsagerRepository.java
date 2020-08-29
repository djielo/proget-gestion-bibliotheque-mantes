package com.bibliotheque.gestion_bibliotheque.dao;

import com.bibliotheque.gestion_bibliotheque.entities.Usager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsagerRepository extends JpaRepository<Usager,Integer> {
}
