package com.projetogama.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.projetogama.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer> {

	//queries
	
	public ArrayList<Produto> findByOrderPreco();
	public ArrayList<Produto> findByOrderPrecoDesc();
	public ArrayList<Produto> findByOrderNomeContaining(String palavraChave);;

}
