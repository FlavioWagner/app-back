package br.com.appnovo.dto;

import br.com.appnovo.model.Colaborador;



public class ColaboradorDto {

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
	public ColaboradorDto(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public ColaboradorDto(Colaborador colaborador) {

		this.nome = colaborador.getNome();
		this.registro = colaborador.getRegistro();
	}
	
	
	
	private String nome; 
	private String registro; 
	
}
	
