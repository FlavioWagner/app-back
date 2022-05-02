package br.com.appnovo.Enums;

public enum EstadoCivil {
	Solteiro("S"),
	Casado("C"),
	Divorciado("D"),
	Viuvo("V");
	
	private String nome;
	public String getNome() {
		return nome;		
	}
	
	EstadoCivil(String nome) {
		this.nome = nome;
	}	
}
