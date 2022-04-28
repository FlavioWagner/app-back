package br.com.appnovo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estado_civil database table.
 * 
 */
@Entity
@Table(name="estado_civil")
@NamedQuery(name="EstadoCivil.findAll", query="SELECT e FROM EstadoCivil e")
public class EstadoCivil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	//bi-directional one-to-one association to PessoaFisica
	@OneToOne(mappedBy="estadoCivil")
	private PessoaFisica pessoaFisica;

	//bi-directional one-to-one association to PreMedico
	@OneToOne(mappedBy="estadoCivil")
	private PreMedico preMedico;

	public EstadoCivil() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PessoaFisica getPessoaFisica() {
		return this.pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public PreMedico getPreMedico() {
		return this.preMedico;
	}

	public void setPreMedico(PreMedico preMedico) {
		this.preMedico = preMedico;
	}

}