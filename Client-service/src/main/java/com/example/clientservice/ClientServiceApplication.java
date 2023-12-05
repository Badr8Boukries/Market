package com.example.clientservice;

import com.example.clientservice.entities.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }




    @Bean
    CommandLineRunner start(ClientRepository clientRepository) {
        return args->{
            Client e = Client.builder()
                    .name("badr")
                    .ville("martil")
                    .build();

            clientRepository.save(e);


            System.out.println("------------------------------------");
                      System.out.println(e.getIdC()+" -------- "+e.getName()+" -------- "+e.getVille());


            System.out.println("------------------------------------");
        };}
}


