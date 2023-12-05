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
public class Client {

    public Integer idC;
    public String ville;
    public String name;

}
