package com.projetogama.ecommerce.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetogama.ecommerce.model.Produto;
import com.projetogama.ecommerce.service.IProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private IProdutoService service;

	@GetMapping("/produtos")
	public ArrayList<Produto> recuperartodoMundo() {
		return service.recuperarTodos();
	}

	@GetMapping("/produto/{codigo}")
	public ResponseEntity<Produto> recuperarPeloCodigo(@PathVariable Integer codigo) {
		Produto res = service.recuperarPeloCodigo(codigo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build(); // utiliza-se build pq não tem corpo para ser exibido
	}

	// CADASTRAR

	@PostMapping("/produtos")
	public ResponseEntity<Produto> inserirNovoProduto(@RequestBody Produto novo) {
		Produto res = service.cadastrarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
}
