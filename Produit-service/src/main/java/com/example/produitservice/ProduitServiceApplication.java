package com.example.produitservice;

import com.example.produitservice.config.GlobalConfig;
import com.example.produitservice.entities.Produit;
import com.example.produitservice.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({GlobalConfig.class})

public class ProduitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProduitRepository produitRepository) {
        return args->{
            Produit e = Produit.builder()
                    .marque("hp")
                    .prix(15000.0)
                    .quantite(1.0)
                    .build();

            produitRepository.save(e);


            System.out.println("------------------------------------");
            System.out.println(e.getIdP()+" -------- "+e.getPrix()+" -------- "+e.getMarque()+"----------"+e.getQuantite());


            System.out.println("------------------------------------");
        };}

}
