package br.com.sitedoph.uniph.infraestrutura.persistencia;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;

public class PersistenciaTest {

	@Test
	public void deveCriarOEntityManagerFactory() {
		EntityManager em = JPAUtil.getEntityManager();
		em.close();
		
	}

}
