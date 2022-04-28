package br.com.appnovo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	private String sigla;

	//bi-directional many-to-one association to PessoaFisica
	@OneToMany(mappedBy="estado")
	private List<PessoaFisica> pessoaFisicas;

	//bi-directional many-to-one association to PreMedico
	@OneToMany(mappedBy="estado")
	private List<PreMedico> preMedicos;

	public Estado() {
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

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<PessoaFisica> getPessoaFisicas() {
		return this.pessoaFisicas;
	}

	public void setPessoaFisicas(List<PessoaFisica> pessoaFisicas) {
		this.pessoaFisicas = pessoaFisicas;
	}

	public PessoaFisica addPessoaFisica(PessoaFisica pessoaFisica) {
		getPessoaFisicas().add(pessoaFisica);
		pessoaFisica.setEstado(this);

		return pessoaFisica;
	}

	public PessoaFisica removePessoaFisica(PessoaFisica pessoaFisica) {
		getPessoaFisicas().remove(pessoaFisica);
		pessoaFisica.setEstado(null);

		return pessoaFisica;
	}

	public List<PreMedico> getPreMedicos() {
		return this.preMedicos;
	}

	public void setPreMedicos(List<PreMedico> preMedicos) {
		this.preMedicos = preMedicos;
	}

	public PreMedico addPreMedico(PreMedico preMedico) {
		getPreMedicos().add(preMedico);
		preMedico.setEstado(this);

		return preMedico;
	}

	public PreMedico removePreMedico(PreMedico preMedico) {
		getPreMedicos().remove(preMedico);
		preMedico.setEstado(null);

		return preMedico;
	}

}