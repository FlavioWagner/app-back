package br.com.appnovo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appnovo.dto.PessoaJuridicaDTO;
import br.com.appnovo.model.PessoaJuridica;
import br.com.appnovo.repository.PessoaJuridicaRepository;

@Service
public class PessoaJuridicaService {
	@Autowired
	PessoaJuridicaRepository juridicaRepository;
	
	public List<PessoaJuridicaDTO> Listar() {
		try {
			return juridicaRepository.findAll()
					               .stream()
					               .map(x -> new PessoaJuridicaDTO(x))
					               .collect(Collectors.toList());
		} catch (Exception e) {
			return new ArrayList<PessoaJuridicaDTO>();
		}	
	}
	
	public PessoaJuridicaDTO Item(Long id) {
		try {
			return new PessoaJuridicaDTO( juridicaRepository.findById(id).get() );
		} catch (Exception e) {
			return new PessoaJuridicaDTO(new PessoaJuridica());
		}	
	}

	public PessoaJuridicaDTO Inserir(PessoaJuridicaDTO item) {
		try {
			PessoaJuridica pessoa = new PessoaJuridica();
			item.setNomeFantasia(item.getNomeFantasia());
			return new PessoaJuridicaDTO(juridicaRepository.save(pessoa));
		} catch (Exception e) {
			return null;
		}
	}

	public PessoaJuridicaDTO Atualizar(PessoaJuridicaDTO item) {
		PessoaJuridica pessoa = null;
		try {
			pessoa = juridicaRepository.findById(item.getId()).get();
			pessoa.setNomeFantasia(item.getNomeFantasia());
			return new PessoaJuridicaDTO(juridicaRepository.save(pessoa));
		} catch (Exception e) {
			return null;
		}
	}

	public boolean Deletar(Long id) {
		try {
			juridicaRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}		
	}	
}
