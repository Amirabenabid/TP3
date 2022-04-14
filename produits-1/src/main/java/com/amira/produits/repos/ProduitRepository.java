package com.amira.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amira.produits.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
