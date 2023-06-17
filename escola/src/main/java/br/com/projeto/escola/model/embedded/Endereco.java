package br.com.projeto.escola.model.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouro;
	private String numero;
	private String bairro;
}
