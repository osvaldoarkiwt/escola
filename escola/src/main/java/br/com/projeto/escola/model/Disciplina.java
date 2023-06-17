package br.com.projeto.escola.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="disciplinas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "sala_numero")
	private Sala sala;
	
	@OneToOne(mappedBy = "curso")
	private Professor professor;
	
	@ManyToMany(mappedBy = "cursos")
	private List<Aluno> alunos;
}
