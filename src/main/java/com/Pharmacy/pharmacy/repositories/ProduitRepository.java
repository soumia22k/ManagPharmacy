package com.Pharmacy.pharmacy.repositories;

import com.Pharmacy.pharmacy.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
