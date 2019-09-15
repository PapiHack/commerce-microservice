package com.commerce.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.microservice.beans.Representant;

@Repository
public interface RepresentantRepository extends JpaRepository<Representant, Long> {

}
