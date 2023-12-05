package com.example.venteservice.web;

import com.example.venteservice.entities.Client;
import com.example.venteservice.entities.Produit;
import com.example.venteservice.entities.Vente;
import com.example.venteservice.openfeign.ClientFeign;
import com.example.venteservice.openfeign.ProduitFeign;
import com.example.venteservice.repository.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VenteController {

    @Autowired
    VenteRepository repository;
@Autowired

    ClientFeign achteurFeignController;
@Autowired
    ProduitFeign produitFeignController;

    @GetMapping("/vente/{id}")
    public Vente getVenteByid(@PathVariable("id") Integer id) {
        Vente v = repository.findById(id).get();


        Produit p = produitFeignController.Get_1_Produit(v.getIdProduit());
        Client a = achteurFeignController.Get_1_Client(v.getIdClient());


        v.setProduit(p);
        v.setClient(a);


        return v;
    }

    @GetMapping("/vente")
    public List<Vente> getAllVente() {
        List<Vente> lv =repository.findAll();
        for (Vente v :lv){
            Produit p=produitFeignController.Get_1_Produit(v.getIdProduit());
            Client a=achteurFeignController.Get_1_Client(v.getIdClient());
            v.setProduit(p);
            v.setClient(a);


        }
        return lv;


    }



}
