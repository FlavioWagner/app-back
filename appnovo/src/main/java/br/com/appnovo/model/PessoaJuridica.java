package br.com.appnovo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pessoa_juridica database table.
 * 
 */
@Entity
@Table(name="pessoa_juridica")
@NamedQuery(name="PessoaJuridica.findAll", query="SELECT p FROM PessoaJuridica p")
public class PessoaJuridica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="nome_fantasia")
	private String nomeFantasia;

	//bi-directional one-to-one association to Colaborador
	@OneToOne
	@JoinColumn(name="id")
	private Colaborador colaborador;

	public PessoaJuridica() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Colaborador getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

}