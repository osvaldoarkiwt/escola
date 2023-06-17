package br.com.projeto.escola.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="salas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero;
	
	@OneToMany(mappedBy = "sala")
	private List<Disciplina> cursos;

}
