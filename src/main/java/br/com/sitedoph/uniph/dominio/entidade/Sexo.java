package br.com.sitedoph.uniph.dominio.entidade;

public enum Sexo {
	
	MASCULINO(1,"Masculino"),
	FEMININO(2, "Feminino");

	private final Integer id;
	private final String descricao;
	
	Sexo (final Integer chave, final String valor){
		
		id = chave;
		descricao = valor;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}	
}
