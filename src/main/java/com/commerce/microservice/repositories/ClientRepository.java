package com.commerce.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commerce.microservice.beans.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
