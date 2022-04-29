package br.com.appnovo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController implements ICustomController<EstadoDTO, Integer>{
	
	@Autowired
	EstadoService estadoService;
	
	@Override
	public List<EstadoDTO> Listar() {
		return estadoService.Listar();
	}

	@Override
	public EstadoDTO Item(Integer id) {
		return estadoService.Item(id);	
	}

	@Override
	public EstadoDTO Inserir(EstadoDTO item) {
		return estadoService.Inserir(item);	
	}

	@Override
	public EstadoDTO atualizar(EstadoDTO item) {
		return estadoService.Atualizar(item);
	}

	@Override
	public boolean deletar(Integer id) {
		return estadoService.Deletar(id);		
	}
	
	@RequestMapping("/dados/sigla/{uf}")
	public EstadoDTO Item(@PathVariable(value="uf") String uf) {
		return estadoService.Item(uf);
	}	
}
