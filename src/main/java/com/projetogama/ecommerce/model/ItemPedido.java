package com.projetogama.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq")
	private Integer numeroSeq;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "valor_unitario")
	private Double valorUnitario;
	
	@Column(name = "valor_total")
	private Double valorTotal;
	
	@ManyToOne
	@JoinColumn(name = "produto_codigo")
	private Produto produto;
	
	@ManyToOne
	@JsonIgnoreProperties("itens")
	@JoinColumn(name = "pedido_numero")
	private Pedido pedido;

	public Integer getNumeroSeq() {
		return numeroSeq;
	}

	public void setNumeroSeq(Integer numeroSeq) {
		this.numeroSeq = numeroSeq;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
