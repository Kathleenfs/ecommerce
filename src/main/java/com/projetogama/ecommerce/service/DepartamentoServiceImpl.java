package com.projetogama.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogama.ecommerce.dao.DepartamentoDAO;
import com.projetogama.ecommerce.model.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	private DepartamentoDAO dao;
	
	@Override
	public Departamento criarNovo(Departamento novo) {
		if(novo.getNome()!= null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Departamento atualizarDados(Departamento dados) {
		if(dados.getCodigo()!= null && dados.getNome()!= null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Departamento>)dao.findAll();
	}

	@Override
	public Departamento buscarPeloId(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void excluirDepartamento(Integer id) {
		dao.deleteById(id);
		
	}

}
