package br.com.projeto.escola.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class InicializacaoTest {

	protected static EntityManagerFactory entityManagerFactory;

	protected static EntityManager entityManager;
	
	@BeforeClass
	public static void SetUpBeforeClass() {
		entityManagerFactory = Persistence.createEntityManagerFactory("escola");
	}
	
	@AfterClass
	public static void TearDownAfterClass() {
		entityManagerFactory.close();
	}
	
	@Before
	public void SetUp() {
		entityManager = entityManagerFactory.createEntityManager(); 
	}
	
	@After
	public void TearDown() {
		entityManager.close();
	}
}
