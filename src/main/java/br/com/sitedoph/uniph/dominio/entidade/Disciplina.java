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

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "TB_DISCIPLINA")
public class Disciplina {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "DESCRICAO")
	@NotBlank(message = "Insira a descrição")
	private String descricao;
	
	@ManyToOne()
	private Professor professor;
	
	@Column(name="CARGA_HORARIA")
	@NotBlank(message = "Insira a carga horaria")
	private String cargaHoraria;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TB_ALUNOTURMA")
	private List<Aluno> aluno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", descricao=" + descricao + ", professor=" + professor + ", cargaHoraria="
				+ cargaHoraria + ", aluno=" + aluno + "]";
	}
		
}
