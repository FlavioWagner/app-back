package br.com.appnovo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.model.Estado;
import br.com.appnovo.repository.EstadoRepository;

@Service
public class EstadoService {
	@Autowired
	EstadoRepository estadoRepository;
	
	public List<EstadoDTO> Listar() {
		try {
			return estadoRepository.findAll()
					               .stream()
					               .map(x -> new EstadoDTO(x))
					               .collect(Collectors.toList());
		} catch (Exception e) {
			return new ArrayList<EstadoDTO>();
		}	
	}
	
	public EstadoDTO Item(Integer id) {
		try {
			return new EstadoDTO( estadoRepository.findById(id).get() );
		} catch (Exception e) {
			return new EstadoDTO(new Estado());
		}	
	}

	public EstadoDTO Inserir(EstadoDTO item) {
		try {
			Estado estado = new Estado();
			estado.setNome(item.getNome());
			estado.setSigla(item.getNome());
			return new EstadoDTO(estadoRepository.save(estado));
		} catch (Exception e) {
			return null;
		}
	}

	public EstadoDTO Atualizar(EstadoDTO item) {
		Estado estado = null;
		try {
			estado = estadoRepository.findBySigla(item.getUf());
			estado.setNome(item.getNome());
			return new EstadoDTO(estadoRepository.save(estado));
		} catch (Exception e) {
			return null;
		}
	}

	public boolean Deletar(Integer id) {
		try {
			estadoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	public EstadoDTO Item(String uf) {
		
		try {
			return new EstadoDTO( estadoRepository.findBySigla(uf) );
		} catch (Exception e) {
			return new EstadoDTO(new Estado());
		}	
	}		 
}
