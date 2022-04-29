package br.com.appnovo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appnovo.model.PreMedico;


public interface PreMedicoRepository extends JpaRepository<PreMedico, Long> {

 	Optional<PreMedico> findByRegistro(String registro);

	}

