package br.com.appnovo.dto;

import br.com.appnovo.model.Estado;

public class EstadoDTO {
	private String uf;
	private String nome;
	
	public EstadoDTO(String uf, String nome) {
		this.uf = uf;
		this.nome = nome;
	}
	
	public EstadoDTO(Estado estado) {
		this.uf = estado.getSigla();
		this.nome = estado.getNome();
	}	
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
