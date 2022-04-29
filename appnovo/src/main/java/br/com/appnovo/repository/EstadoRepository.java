package br.com.appnovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appnovo.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	Estado findBySigla(String Sigla);
}
