package br.com.appnovo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.repository.EstadoRepository;

@RestController
public class EstadoController {
	@Autowired
	EstadoRepository estadoRepository;
	
	@RequestMapping
	@ResponseBody
	public String Estados(){
		return "ok";
	}
	
	@RequestMapping("/estados")
	public List<EstadoDTO> ListEstados(){
		return estadoRepository.findAll()
				               .stream()
				               .map(x -> new EstadoDTO(x))
				               .collect(Collectors.toList());
	}
}
