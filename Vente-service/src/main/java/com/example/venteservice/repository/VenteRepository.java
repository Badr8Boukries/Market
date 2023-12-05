package com.example.venteservice.repository;

import com.example.venteservice.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente,Integer> {
}
