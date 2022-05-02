package br.com.appnovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appnovo.model.Colaborador;

public interface ColaboradorRepository extends  JpaRepository<Colaborador, Long>{
	
}
