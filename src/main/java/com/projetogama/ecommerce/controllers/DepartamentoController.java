package com.projetogama.ecommerce.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetogama.ecommerce.model.Departamento;
import com.projetogama.ecommerce.service.IDepartamentoService;

@RestController
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService service;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> recuperarTodos(){
		return service.buscarTodos();
		}
	
	
	@PostMapping("/departamentos")
	public ResponseEntity<Departamento> incluirNovo(@RequestBody Departamento novo){//O objeto response Entity me da uma resposta htttp onde eu coloco codigo ou mensagem
		Departamento res = service.criarNovo(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping("/departamentos")
	public ResponseEntity<Departamento> alterar(@RequestBody Departamento dados){
		Departamento res = service.atualizarDados(dados);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
		
	}
	
	@DeleteMapping("/departamento/{id}")
	public ResponseEntity<Departamento> excluirDepartamento(@PathVariable Integer id){
		service.excluirDepartamento(id);
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/departamento/{codigo}")
	public ResponseEntity<Departamento> buscarPeloId(@PathVariable Integer codigo){
		Departamento res = service.buscarPeloId(codigo);
		if(res != null) {
			return ResponseEntity.ok(res);
			
		}
		return ResponseEntity.notFound().build();
	}
	

}
