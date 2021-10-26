package com.fiap.servicocliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.servicocliente.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
