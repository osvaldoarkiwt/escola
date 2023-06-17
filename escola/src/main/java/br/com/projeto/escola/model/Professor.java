package br.com.projeto.escola.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.projeto.escola.model.embedded.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="professores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer idade;
	@Embedded
	private Endereco endereco;
	@OneToOne
	@JoinColumn(name="curso_id")
	private Disciplina curso;

}
