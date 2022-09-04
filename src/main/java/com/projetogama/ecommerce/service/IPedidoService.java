package com.projetogama.ecommerce.service;

import com.projetogama.ecommerce.model.Pedido;

public interface IPedidoService {
	
	public Pedido inserirNovo(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);

}
