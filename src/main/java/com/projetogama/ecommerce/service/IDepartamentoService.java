package com.projetogama.ecommerce.service;

import java.util.ArrayList;

import com.projetogama.ecommerce.model.Departamento;

public interface IDepartamentoService {
	
	public Departamento criarNovo(Departamento novo);
	public Departamento atualizarDados(Departamento dados);
	public ArrayList<Departamento> buscarTodos();
	public Departamento buscarPeloId(Integer id);
	public void excluirDepartamento(Integer id);

}
