package br.com.appnovo.dto;

import br.com.appnovo.model.EstadoCivil;

public class EstadoCivilDTO {

	
	private String nome;

	public EstadoCivilDTO(String nome) {
		this.nome = nome;
	}
	
	
	public EstadoCivilDTO(EstadoCivil estadoCivil) {
		this.nome = estadoCivil.getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
