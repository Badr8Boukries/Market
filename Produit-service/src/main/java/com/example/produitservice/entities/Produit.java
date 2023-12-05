package com.example.produitservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idP;

    public String marque;

    public Double quantite;

    public Double prix;
}
