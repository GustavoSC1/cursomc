package com.gustavo.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.gustavo.cursomc.domain.Categoria;

//DTO (Data Transfer Object): é um objeto que tem o papel de carregar dados das entidades de forma simples,
//podendo inclusive "projetar" apenas alguns dados da entidade original. 
// https://pt.stackoverflow.com/questions/31362/o-que-é-um-dto
public class CategoriaDTO implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=80, message="O tamanho deve ser entre 5 e 80 caracteres")
	private String nome;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
