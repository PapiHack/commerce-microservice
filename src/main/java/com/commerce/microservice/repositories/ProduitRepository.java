package com.commerce.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.microservice.beans.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
