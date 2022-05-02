package br.com.appnovo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.service.EstadoService;

@RestController
@RequestMapping("/estadocivil")
public class EstadoCivilController extends CustomClassController<EstadoService, EstadoDTO, Integer> {
	
	@Autowired
	private EstadoService estadoService;

	
	
	protected EstadoService getService() {
		return this.estadoService;
	}
}