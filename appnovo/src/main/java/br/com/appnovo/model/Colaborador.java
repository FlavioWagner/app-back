package br.com.appnovo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the colaborador database table.
 * 
 */
@Entity
@NamedQuery(name="Colaborador.findAll", query="SELECT c FROM Colaborador c")
public class Colaborador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String registro;

	//bi-directional one-to-one association to PessoaFisica
	@OneToOne(mappedBy="colaborador")
	private PessoaFisica pessoaFisica;

	//bi-directional one-to-one association to PessoaJuridica
	@OneToOne(mappedBy="colaborador")
	private PessoaJuridica pessoaJuridica;

	public Colaborador() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public PessoaFisica getPessoaFisica() {
		return this.pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public PessoaJuridica getPessoaJuridica() {
		return this.pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

}