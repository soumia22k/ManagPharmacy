package com.Pharmacy.pharmacy.controllers;


import com.Pharmacy.pharmacy.entities.Produit;
import com.Pharmacy.pharmacy.repositories.ProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {


    private final ProduitRepository produitRepository;

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }


    @PostMapping("/produits")


    public Produit saveProduit(@RequestBody Produit produit) {
        return produitRepository.save(produit);
    }

    @GetMapping("/produit")
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }


}
