package br.com.appnovo.dto;

import br.com.appnovo.model.PessoaJuridica;

public class PessoaJuridicaDTO {
	private Long id;
	private String nomeFantasia;
	
	public PessoaJuridicaDTO(Long id, String nomeFantasia) {
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
	}
	
	public PessoaJuridicaDTO(PessoaJuridica juridica) {
		super();
		this.id = juridica.getId();
		this.nomeFantasia = juridica.getNomeFantasia();
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}
