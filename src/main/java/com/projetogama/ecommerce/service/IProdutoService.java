package com.projetogama.ecommerce.service;

import java.util.ArrayList;

import com.projetogama.ecommerce.model.Produto;

public interface IProdutoService {
	
	public ArrayList<Produto> recuperarTodos();
	public Produto recuperarPeloCodigo(Integer codigo);
	public Produto cadastrarNovo(Produto novo);
	
}
