package br.com.appnovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appnovo.model.Funcionario;

public interface FuncionarioReposiytory extends JpaRepository<Funcionario, Long> {

}
