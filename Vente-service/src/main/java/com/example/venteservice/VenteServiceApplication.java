package com.example.venteservice;

import ch.qos.logback.core.CoreConstants;
import com.example.venteservice.entities.Vente;
import com.example.venteservice.repository.VenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class VenteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenteServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(VenteRepository repository) {
        return args -> {

            Vente v1 = Vente.builder()

                    .idClient(1)
                    .idProduit(1)
                    .produit(null)
                    .client(null)
                    .build();
            repository.save(v1);



            System.out.println(v1.produit+" "+v1.client);


            System.out.println("marche bien");

        };

    }
    }
