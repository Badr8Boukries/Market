package com.example.produitservice.web;

import com.example.produitservice.config.GlobalConfig;
import com.example.produitservice.entities.Produit;
import com.example.produitservice.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitController {

    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    GlobalConfig globalConfig;

    @GetMapping("globalconfig")
    public GlobalConfig getGlobalConfig(){
        return globalConfig;
    }

    @GetMapping("/produit")
    public List<Produit> getAll(){

        return produitRepository.findAll();
    }

    @GetMapping("produit/{id}")
    public Produit getByid(@PathVariable ("id")Integer id){

        return produitRepository.findById(id).get();
    }




}




