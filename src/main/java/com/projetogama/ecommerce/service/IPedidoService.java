package com.projetogama.ecommerce.service;

import java.util.ArrayList;

import com.projetogama.ecommerce.dto.FaturamentoMensal;
import com.projetogama.ecommerce.model.Pedido;

public interface IPedidoService {
	
	public Pedido inserirNovo(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);
	public ArrayList<FaturamentoMensal> recuperarFaturamentoMensal(Integer ano);
}
