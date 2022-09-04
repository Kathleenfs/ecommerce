package com.projetogama.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogama.ecommerce.dao.ProdutoDAO;
import com.projetogama.ecommerce.model.Produto;

@Service
public class ProdutoServiceImpl  implements IProdutoService{
	
	@Autowired
	private ProdutoDAO dao;
	@Override
	public ArrayList<Produto> recuperarTodos() {
		
		return (ArrayList<Produto>)dao.findAll();
		//return dao.findByOrderNomeContaining("Console");
		//return dao.findByOrderPreco();
		//return dao.findByOrderPrecoDesc();
	}

	@Override
	public Produto recuperarPeloCodigo(Integer codigo) {

		return dao.findById(codigo).orElse(null);
	}

	@Override
	public Produto cadastrarNovo(Produto novo) {
		return dao.save(novo);
	}

	@Override
	public ArrayList<Produto> buscarPorPalavraChave(String palavra) {
		
		return dao.findByOrderNomeContaining(palavra);
	}
}
