package br.com.appnovo.dto;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.appnovo.model.Estado;
import br.com.appnovo.model.EstadoCivil;
import br.com.appnovo.model.PreMedico;


public class PreMedicoDTO {
	
	
	private Long id; 





	private String genero;
	private Integer idEstado;
	private String nacionalidade;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date nascimento;
	private Boolean nascimentoExterior;
	private String nome;
	private String registro;
	private String rg;
	private Date rgExpedicao;
	private String rgOrgao;
	private String titulo;
	private String tituloSecao;
	private String tituloZona;
	
	
	
	public PreMedicoDTO(Long id, String categoria, String genero, Integer idEstado, String nacionalidade, Date nascimento,
			Boolean nascimentoExterior, String nome, String registro, String rg, Date rgExpedicao, String rgOrgao,
			String titulo, String tituloSecao, String tituloZona, Estado estado, EstadoCivil estadoCivil) {
		
		this.id = id;
		this.categoria = categoria;
		this.genero = genero;
		this.idEstado = idEstado;
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
		this.nascimentoExterior = nascimentoExterior;
		this.nome = nome;
		this.registro = registro;
		this.rg = rg;
		this.rgExpedicao = rgExpedicao;
		this.rgOrgao = rgOrgao;
		this.titulo = titulo;
		this.tituloSecao = tituloSecao;
		this.tituloZona = tituloZona;
		this.estado = estado;
		this.estadoCivil = estadoCivil;
	}

    public PreMedicoDTO(PreMedico preMedico) {
    	this.id = preMedico.getId();
    	this.categoria = preMedico.getCategoria();
		this.genero = preMedico.getGenero();
		this.idEstado = preMedico.getIdEstado();
		this.nacionalidade = preMedico.getNacionalidade();
		this.nascimento = preMedico.getNascimento();
		this.nascimentoExterior = preMedico.getNascimentoExterior();
		this.nome = preMedico.getNome();
		this.registro = preMedico.getRegistro();
		this.rg = preMedico.getRg();
		this.rgExpedicao = preMedico.getRgExpedicao();
		this.rgOrgao = preMedico.getRgOrgao();
		this.titulo = preMedico.getTitulo();
		this.tituloSecao = preMedico.getTituloSecao();
		this.tituloZona = preMedico.getTituloZona();
		this.estado = preMedico.getEstado();
		this.estadoCivil = preMedico.getEstadoCivil();
    }
	
	
	
	
	private String categoria;
	public Estado estado;
	public EstadoCivil estadoCivil; 
	
	public Long getid() {
		return id;
	}

	public void setid(Long idMedico) {
		this.id = idMedico;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

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

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
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


	

	
	
	
	
	
	
	


}
