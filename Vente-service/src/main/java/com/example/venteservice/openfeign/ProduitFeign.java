package com.example.venteservice.openfeign;



import com.example.venteservice.entities.Client;
import com.example.venteservice.entities.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PRODUIT-SERVICE")
@Service


public interface ProduitFeign {

    @Bean
    @GetMapping("/produit")
    public List<Produit> getAllProduit();

    @Bean
    @GetMapping("/produit/{id}")
    public Produit Get_1_Produit (@PathVariable ("id")Integer id);


}
