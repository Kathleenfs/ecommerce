package com.projetogama.ecommerce.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetogama.ecommerce.model.Produto;
import com.projetogama.ecommerce.service.IProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private IProdutoService service;
	
	@GetMapping("/produtos")
	public ArrayList<Produto> recuperartodoMundo(){
		return service.recuperarTodos();
		}
	

}
