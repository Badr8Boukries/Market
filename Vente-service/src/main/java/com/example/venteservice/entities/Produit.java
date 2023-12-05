package com.example.venteservice.entities;

import lombok.*;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Service
public class Produit {


    public Integer idP;

    public String marque;

    public Double quantite;

    public Double prix;
}
