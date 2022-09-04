package com.projetogama.ecommerce.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projetogama.ecommerce.model.Pedido;

@Controller
public class PedidoController {
	
	@GetMapping("/pedidos/{numero}")
	public ResponseEntity<Pedido> recuperarPeloNumero(@PathVariable Integer numero){
		return null;
	}
	
	@PostMapping("/pedidos")
	public ResponseEntity<Pedido> inserirNovoPedido(@RequestBody Pedido novo){
		return null;
		
	}
}
