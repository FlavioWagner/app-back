package br.com.appnovo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.appnovo.model.Funcionario;


public class FuncionarioDTO {

	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public Date getDesligamento() {
		return desligamento;
	}
	public void setDesligamento(Date desligamento) {
		this.desligamento = desligamento;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date admissao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date desligamento;
	private String matricula;
	
	
	
	public FuncionarioDTO(Date admissao, Date desligamento, String matricula) {
		this.admissao = admissao;
		this.desligamento = desligamento;
		this.matricula = matricula;
	}

	
	
	public FuncionarioDTO(Funcionario funcionario) {
		this.admissao = funcionario.getAdmissao();
		this.desligamento = funcionario.getDesligamento();
		this.matricula = funcionario.getMatricula();
	}
	
}
