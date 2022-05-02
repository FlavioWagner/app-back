package br.com.appnovo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.PreMedicoDTO;
import br.com.appnovo.service.PreMedicoService;

@RestController
@RequestMapping("/premedico")
public class PreMedicoController extends CustomClassController<PreMedicoService,PreMedicoDTO,Long>{
	
	@Autowired
	private PreMedicoService preMedicoService;
	
	@Autowired
	ModelMapper mapper;	
	
	@Override
	protected void LoadData() {
		setService(this.preMedicoService);
		setMapper(this.mapper);
	}
}
