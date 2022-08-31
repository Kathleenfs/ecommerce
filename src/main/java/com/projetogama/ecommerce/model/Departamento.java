package com.projetogama.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="departamento")
public class Departamento {
	
	@Column(name="codigo") 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "descricao", nullable = true, columnDefinition = "TEXT")
	private String descricao;
	
	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL) // dentro do produto qual atributo se refere ao departamento
	@JsonIgnoreProperties("departamento") // para encerrar o loop. Na volta ignore departamento. ele vai em protduto traz departamento chega em departamento pede produto e começa o ciclo
	private List<Produto> listaProdutos;
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
