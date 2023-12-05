package com.example.venteservice;

import com.example.venteservice.entities.Vente;
import com.example.venteservice.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class VenteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenteServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(Repository repository) {
        return args -> {

            Vente v1= Vente.builder()
                    .idVente(null)
                    .idAchteur(1)
                    .idProduit(2)
                    .produit(null)
                    .achteur(null)
                    .build();
            repository.save(v1);
            Vente v2= Vente.builder()
                    .idVente(null)
                    .idAchteur(1)
                    .idProduit(3)
                    .produit(null)
                    .achteur(null)
                    .build();
            repository.save(v2);







            System.out.println("marche bien");

        };

    }

}