package br.com.projeto.escola.test;

import org.junit.Test;

import br.com.projeto.escola.model.Disciplina;
import br.com.projeto.escola.model.Professor;
import br.com.projeto.escola.model.embedded.Endereco;

public class ProfessorTest extends InicializacaoTest{

	@Test
	public void adicionaProfessor() {
		
		Disciplina curso = entityManager.find(Disciplina.class, 1L);
	
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro("Rua do Naútico");
		endereco.setNumero("1035");
		endereco.setBairro("Meireles");
		
		Professor professor = new Professor();
		
		
		professor.setNome("Allan");
		professor.setEndereco(endereco);
		professor.setIdade(30);
		professor.setCurso(curso);
		entityManager.getTransaction().begin();
		
		entityManager.persist(professor);
		
		entityManager.getTransaction().commit();
	}
	
}
