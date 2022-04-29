package br.com.appnovo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appnovo.model.PreMedico;


public interface PreMedicoRepository extends JpaRepository<PreMedico, Long> {

	List<PreMedico> findByRegistro(String registro);

	}

