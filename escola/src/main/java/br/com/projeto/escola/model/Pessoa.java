package br.com.projeto.escola.model;

import javax.persistence.Embedded;

import br.com.projeto.escola.model.embedded.Endereco;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	@Embedded
	private Endereco endereco;

}
