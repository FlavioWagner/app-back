package br.com.appnovo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pre_medico database table.
 * 
 */
@Entity
@Table(name="pre_medico")
@NamedQuery(name="PreMedico.findAll", query="SELECT p FROM PreMedico p")
public class PreMedico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String categoria;

	private String genero;

	@Column(name="id_estado")
	private Integer idEstado;

	private String nacionalidade;

	@Temporal(TemporalType.DATE)
	private Date nascimento;

	@Column(name="nascimento_exterior")
	private Boolean nascimentoExterior;

	private String nome;

	private String registro;

	private String rg;

	@Temporal(TemporalType.DATE)
	@Column(name="rg_expedicao")
	private Date rgExpedicao;

	@Column(name="rg_orgao")
	private String rgOrgao;

	private String titulo;

	@Column(name="titulo_secao")
	private String tituloSecao;

	@Column(name="titulo_zona")
	private String tituloZona;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="id_estado_civil")
	private Estado estado;

	//bi-directional one-to-one association to EstadoCivil
	@OneToOne
	@JoinColumn(name="id")
	private EstadoCivil estadoCivil;

	public PreMedico() {
	}
	
	
	

	public PreMedico(String categoria, String genero, Integer idEstado, String nacionalidade, Date nascimento,
			Boolean nascimentoExterior, String nome, String registro, String rg, Date rgExpedicao, String rgOrgao,
			String titulo, String tituloSecao, String tituloZona, Estado estado, EstadoCivil estadoCivil) {
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




	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Date getNascimento() {
		return this.nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Boolean getNascimentoExterior() {
		return this.nascimentoExterior;
	}

	public void setNascimentoExterior(Boolean nascimentoExterior) {
		this.nascimentoExterior = nascimentoExterior;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return this.registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getRgExpedicao() {
		return this.rgExpedicao;
	}

	public void setRgExpedicao(Date rgExpedicao) {
		this.rgExpedicao = rgExpedicao;
	}

	public String getRgOrgao() {
		return this.rgOrgao;
	}

	public void setRgOrgao(String rgOrgao) {
		this.rgOrgao = rgOrgao;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTituloSecao() {
		return this.tituloSecao;
	}

	public void setTituloSecao(String tituloSecao) {
		this.tituloSecao = tituloSecao;
	}

	public String getTituloZona() {
		return this.tituloZona;
	}

	public void setTituloZona(String tituloZona) {
		this.tituloZona = tituloZona;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

}