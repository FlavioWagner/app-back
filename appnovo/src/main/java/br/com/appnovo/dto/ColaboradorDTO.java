package br.com.appnovo.dto;

import br.com.appnovo.model.Colaborador;



public class ColaboradorDTO {
	private String nome; 
	private String registro; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public ColaboradorDTO(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public ColaboradorDTO(Colaborador colaborador) {

		this.nome = colaborador.getNome();
		this.registro = colaborador.getRegistro();
	}	
}
	
