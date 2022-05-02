package br.com.appnovo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.Enums.Genero;
import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController  extends CustomClassController<EstadoService, EstadoDTO, Integer> {

	@Autowired
	EstadoService estadoService;

	@Autowired
	ModelMapper mapper;
	
	@Override
	protected void LoadData() {
		setService(this.estadoService);
		setMapper(this.mapper);
	}
}
