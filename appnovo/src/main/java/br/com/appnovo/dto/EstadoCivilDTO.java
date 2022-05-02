package br.com.appnovo.dto;

import br.com.appnovo.model.EstadoCivil;

public class EstadoCivilDTO {

	private Integer id;	
	private String nome;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public EstadoCivilDTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}	

	public EstadoCivilDTO(EstadoCivil estadoCivil) {
		super();
		this.id = estadoCivil.getId();
		this.nome = estadoCivil.getNome();
	}
}
