package br.com.sitedoph.uniph.infraestrutura.persistencia.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

public interface GenericDAO<T, ID extends Serializable> {

	T salvar(T entidade);

	void excluir(T entidade);

	T buscarPorId(ID id);

	List<T> buscarPorTodos();

	List<T> buscarPorCriteria(Criterion... criteria);

	List<T> buscarPorExemplo(T exemplo, String... propriedadesAExcluir);
}
