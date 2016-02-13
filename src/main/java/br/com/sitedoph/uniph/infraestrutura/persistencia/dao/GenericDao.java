package br.com.sitedoph.uniph.infraestrutura.persistencia.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

public interface GenericDao<T, ID extends Serializable> {

	T salvarOuAtualizar(T entidade);

	T excluir(Integer id);

	T buscarPorId(Integer id);

	List<T> buscarPorTodos();

	List<T> buscarPorCriteria(Criterion... criteria);

	List<T> buscarPorExemplo(T exemplo, String propriedadesAExcluir);
}
