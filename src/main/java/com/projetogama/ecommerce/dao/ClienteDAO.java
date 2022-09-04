package com.projetogama.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.projetogama.ecommerce.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}
