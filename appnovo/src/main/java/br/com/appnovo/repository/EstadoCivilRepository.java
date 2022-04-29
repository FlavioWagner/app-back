package br.com.appnovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appnovo.model.EstadoCivil;

public interface EstadoCivilRepository extends JpaRepository<EstadoCivil, Integer> {

}
