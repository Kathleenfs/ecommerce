package com.projetogama.ecommerce.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projetogama.ecommerce.dto.FaturamentoMensal;
import com.projetogama.ecommerce.model.Pedido;
import com.projetogama.ecommerce.service.IPedidoService;

@Controller
public class PedidoController {
	
	@Autowired
	private IPedidoService service;
	
	
	@GetMapping("/pedidos/{numero}")
	public ResponseEntity<Pedido> recuperarPeloNumero(@PathVariable Integer numero){
		Pedido res = service.recuperarPeloNumero(numero);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
		
	}
	
	@PostMapping("/pedidos")
	public ResponseEntity<Pedido> inserirNovoPedido(@RequestBody Pedido novo){
		
		return ResponseEntity.ok(service.inserirNovo(novo));
		
	}
	
	@GetMapping("/faturamento/{ano}")
	public ArrayList<FaturamentoMensal> recuperarFaturamento(@PathVariable Integer ano){
		return service.recuperarFaturamentoMensal(ano);
	}
	
}
