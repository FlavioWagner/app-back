package br.com.appnovo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appnovo.dto.ColaboradorDTO;
import br.com.appnovo.model.Colaborador;
import br.com.appnovo.repository.ColaboradorRepository;

@Service
public class ColaboradorService {
	@Autowired
	ColaboradorRepository colaboradorRepository;
	
	public List<ColaboradorDTO> Listar() {
		try {
			return colaboradorRepository.findAll()
					               .stream()
					               .map(x -> new ColaboradorDTO(x))
					               .collect(Collectors.toList());
		} catch (Exception e) {
			return new ArrayList<ColaboradorDTO>();
		}	
	}
	
	public ColaboradorDTO Item(Long id) {
		try {
			return new ColaboradorDTO( colaboradorRepository.findById(id).get() );
		} catch (Exception e) {
			return new ColaboradorDTO(new Colaborador());
		}	
	}

	public ColaboradorDTO Inserir(ColaboradorDTO item) {
		try {
			Colaborador colaborador = new Colaborador();
			colaborador.setNome(item.getNome());
			colaborador.setRegistro(item.getRegistro());
			return new ColaboradorDTO(colaboradorRepository.save(colaborador));
		} catch (Exception e) {
			return null;
		}
	}

	public ColaboradorDTO Atualizar(ColaboradorDTO item) {
		Colaborador colaborador = null;
		try {
			colaborador = colaboradorRepository.findById(item.getId()).get();
			colaborador.setNome(item.getNome());
			return new ColaboradorDTO(colaboradorRepository.save(colaborador));
		} catch (Exception e) {
			return null;
		}
	}

	public boolean Deletar(Long id) {
		try {
			colaboradorRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
}
