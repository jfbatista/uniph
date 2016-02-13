package br.com.sitedoph.uniph.infraestrutura.persistencia;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sitedoph.uniph.dominio.entidade.Aluno;

public class PersistenciaTest {

	
	public static Calendar converterParaCalendar(String data) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dt;
		dt = df.parse(data);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		return cal;
	}

	@Test
	public void deveCriarOEntityManagerFactory() {
		EntityManager em = JPAUtil.getEntityManager();
		em.close();

	}

	@Ignore
	public void deveInserirAlunoNoBD() throws ParseException {
		EntityManager em = JPAUtil.getEntityManager();

		Aluno aluno = new Aluno();

		aluno.setCpf("79079512168");
		aluno.setDataCadastro(converterParaCalendar("12/04/1976"));
		aluno.setDataNascimento(converterParaCalendar("12/04/1976"));
		aluno.setEmail("jfbatista@hotmail.com");
		aluno.setNome("Juvenal Ferreira Batista");
		aluno.setRg("1619806");
		aluno.setTelefone("6136295109");

		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();

		Query qry = em.createQuery("SELECT a FROM Aluno a");

		List<Aluno> alunos = qry.getResultList();

		for (Aluno a : alunos) {
			final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Cód:" + a.getId() + " " + "Nome:" + a.getNome() + " " + "Data Nasc:"
					+ df.format(a.getDataCadastro().getTime()));
		}

		em.close();

	}

}
