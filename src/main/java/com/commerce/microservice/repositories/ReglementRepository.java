package com.commerce.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.microservice.beans.Reglement;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long>{

}
