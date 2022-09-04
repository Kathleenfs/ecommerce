package com.projetogama.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.projetogama.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {

}
