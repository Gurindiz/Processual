package br.com.unialfa.cadastro.enumerator;

public enum CargoEnum {
	Diretor(1L, "Diretor", "D"), 
	Gerente(2L, "Gerente", "G"),
	Vendedor(3L, "Vendedor", "V");

	private Long id;
	private String descricao;
	private String sigla;

	private CargoEnum(Long id, String descricao, String sigla) {
		this.id = id;
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	public String getSigla() {
		return sigla;
	}
	

}
