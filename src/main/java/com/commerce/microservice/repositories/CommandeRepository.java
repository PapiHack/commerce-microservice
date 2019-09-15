package com.commerce.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.microservice.beans.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
