package br.com.sitedoph.uniph.infraestrutura.persistencia.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

import br.com.sitedoph.uniph.infraestrutura.persistencia.dao.GenericDao;

public class GenericDaoHibernate <T, ID extends Serializable> implements GenericDao<T, ID> {

	@Override
	public T salvarOuAtualizar(T entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T excluir(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> buscarPorTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> buscarPorCriteria(Criterion... criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> buscarPorExemplo(T exemplo, String propriedadesAExcluir) {
		// TODO Auto-generated method stub
		return null;
	}
   
}