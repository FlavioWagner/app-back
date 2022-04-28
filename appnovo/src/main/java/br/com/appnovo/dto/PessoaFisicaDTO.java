package br.com.appnovo.dto;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.appnovo.model.PessoaFisica;

public class PessoaFisicaDTO {
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Boolean getNascimentoExterior() {
		return nascimentoExterior;
	}
	public void setNascimentoExterior(Boolean nascimentoExterior) {
		this.nascimentoExterior = nascimentoExterior;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getRgExpedicao() {
		return rgExpedicao;
	}
	public void setRgExpedicao(Date rgExpedicao) {
		this.rgExpedicao = rgExpedicao;
	}
	public String getRgOrgao() {
		return rgOrgao;
	}
	public void setRgOrgao(String rgOrgao) {
		this.rgOrgao = rgOrgao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTituloSecao() {
		return tituloSecao;
	}
	public void setTituloSecao(String tituloSecao) {
		this.tituloSecao = tituloSecao;
	}
	public String getTituloZona() {
		return tituloZona;
	}
	public void setTituloZona(String tituloZona) {
		this.tituloZona = tituloZona;
	}
	private String categoria;
	private String genero;
	private String nacionalidade;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date nascimento;
    private Boolean nascimentoExterior;
	private String rg;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date rgExpedicao;
	private String rgOrgao;
	private String titulo;
	private String tituloSecao;
	private String tituloZona;

	
	public PessoaFisicaDTO(String categoria, String genero, String nacionalidade, Date nascimento,
			Boolean nascimentoExterior, String rg, Date rgExpedicao, String rgOrgao, String titulo, String tituloSecao,
			String tituloZona) {
		super();
		this.categoria = categoria;
		this.genero = genero;
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
		this.nascimentoExterior = nascimentoExterior;
		this.rg = rg;
		this.rgExpedicao = rgExpedicao;
		this.rgOrgao = rgOrgao;
		this.titulo = titulo;
		this.tituloSecao = tituloSecao;
		this.tituloZona = tituloZona;
	}
	
	
	public PessoaFisicaDTO(PessoaFisica pessoaFisica) {

		this.categoria = pessoaFisica.getCategoria();
		this.genero = pessoaFisica.getGenero();
		this.nacionalidade = pessoaFisica.getNacionalidade();
		this.nascimento = pessoaFisica.getNascimento();
		this.nascimentoExterior = pessoaFisica.getNascimentoExterior();
		this.rg = pessoaFisica.getRg();
		this.rgExpedicao = pessoaFisica.getRgExpedicao();
		this.rgOrgao = pessoaFisica.getRgOrgao();
		this.titulo = pessoaFisica.getTitulo();
		this.tituloSecao = pessoaFisica.getTituloSecao();
		this.tituloZona = pessoaFisica.getTituloZona();
	}
	
	

}
