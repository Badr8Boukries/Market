package com.example.venteservice.openfeign;


import com.example.venteservice.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CLIENT-SERVICE")
@Service



public interface ClientFeign {

@Bean
    @GetMapping("/client")
    public List<Client> getAllClient();
@Bean
    @GetMapping("/client/{id}")
    public Client Get_1_Client (@PathVariable ("id")Integer id);


}
