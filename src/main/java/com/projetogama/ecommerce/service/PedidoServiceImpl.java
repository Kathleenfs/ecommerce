package com.projetogama.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetogama.ecommerce.dao.PedidoDAO;
import com.projetogama.ecommerce.dto.FaturamentoMensal;
import com.projetogama.ecommerce.model.ItemPedido;
import com.projetogama.ecommerce.model.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService{
	
	
	@Autowired
	private PedidoDAO dao;
	
	@Override
	public Pedido inserirNovo(Pedido novo) {
		//Antes de fazer um SAVE, eu preciso indicar aos "filhos"(itens) a qual pedidos eles pertencem
		for(ItemPedido item: novo.getItens()) {
			item.setPedido(novo);
		}
		return dao.save(novo);
	}

	@Override
	public Pedido recuperarPeloNumero(Integer numero) {
		return dao.findById(numero).orElse(null);
	}

	@Override
	public ArrayList<FaturamentoMensal> recuperarFaturamentoMensal(Integer ano) {
		return dao.recuperarFaturamentoPorAno(ano);
	}
}
