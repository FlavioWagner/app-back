package br.com.appnovo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.ColaboradorDTO;
import br.com.appnovo.service.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController extends CustomClassController<ColaboradorService, ColaboradorDTO, Long> {

	@Autowired
	ColaboradorService colaboradorService;
	
	@Autowired
	ModelMapper mapper;	
	
	@Override
	protected void LoadData() {
		setService(this.colaboradorService);
		setMapper(this.mapper);
	}
}
