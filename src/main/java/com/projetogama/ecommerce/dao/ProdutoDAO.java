package com.projetogama.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.projetogama.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

}
