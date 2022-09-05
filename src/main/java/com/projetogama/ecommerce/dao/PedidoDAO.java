package com.projetogama.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.projetogama.ecommerce.dto.FaturamentoMensal;
import com.projetogama.ecommerce.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer> {
	
	//query 
	
	@Query("SELECT new "
	+ "com.projetogama.ecommerce.dto.FaturamentoMensal(month(p.data), sum(p.valorFinal)) "
	+ "FROM Pedido p "
	+ "WHERE year(p.data) = :ano "
	+ "GROUP BY month(p.data) "
	+ "ORDER BY month(p.data) ")
	public ArrayList<FaturamentoMensal> recuperarFaturamentoPorAno(@Param("ano") Integer ano);
	

}

