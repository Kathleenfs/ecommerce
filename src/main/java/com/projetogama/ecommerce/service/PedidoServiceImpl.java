package com.projetogama.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogama.ecommerce.dao.PedidoDAO;
import com.projetogama.ecommerce.model.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService{
	
	
	@Autowired
	private PedidoDAO dao;
	
	@Override
	public Pedido inserirNovo(Pedido novo) {
		return dao.save(novo);
	}

	@Override
	public Pedido recuperarPeloNumero(Integer numero) {
		return dao.findById(numero).orElse(null);
	}

}
