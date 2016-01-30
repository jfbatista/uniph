package br.com.sitedoph.uniph.dominio.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DISCIPLINA")
public class Disciplina {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@ManyToOne()
	private Professor professor;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TB_ALUNOTURMA")
	private List<Aluno> aluno;
	
}
