package br.com.projeto.escola.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.projeto.escola.model.embedded.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="alunos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aluno{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula;
	private String nome;
	private Integer idade;
	@Embedded
	private Endereco endereco;
	@ManyToMany
	@JoinTable(name="curso_aluno",
				joinColumns = @JoinColumn(name = "aluno_matricula"),
				inverseJoinColumns = @JoinColumn(name = "curso_id"))
	private List<Disciplina> cursos;
}
