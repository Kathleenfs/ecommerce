package com.projetogama.ecommerce.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogama.ecommerce.dao.DepartamentoDAO;
import com.projetogama.ecommerce.model.Departamento;

@RestController
public class DepartamentoController {
	
	@Autowired
	private DepartamentoDAO dao;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> recuperarTodos(){
		ArrayList<Departamento> lista;
		lista = (ArrayList<Departamento>)dao.findAll(); // realiza uma conversão de findAll para uma lista
		return lista;
		}
	
	

}
