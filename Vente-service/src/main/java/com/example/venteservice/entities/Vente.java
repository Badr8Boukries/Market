package com.example.venteservice.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.springframework.context.annotation.ImportResource;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idV;

    public Integer idClient;
    public  Integer idProduit;
    @Transient
     public Client client;
    @Transient
    public Produit  produit;


}
