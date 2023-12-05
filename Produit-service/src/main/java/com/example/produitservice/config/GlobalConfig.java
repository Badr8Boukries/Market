package com.example.produitservice.config;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@ConfigurationProperties(prefix = "global.params")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor


public class GlobalConfig {
    int p1;
    int p2;
}

