package br.com.projeto.escola.model;

import javax.persistence.Embedded;

import br.com.projeto.escola.model.embedded.Endereco;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Pessoa {
	
	private String nome;
	private Integer idade;
	@Embedded
	private Endereco endereco;
}
