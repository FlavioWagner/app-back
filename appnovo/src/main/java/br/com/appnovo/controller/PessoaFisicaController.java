package br.com.appnovo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.PessoaFisicaDTO;
import br.com.appnovo.service.PessoaFisicaService;

@RestController
@RequestMapping("/fisica")
public class PessoaFisicaController extends CustomClassController<PessoaFisicaService, PessoaFisicaDTO, Long>{

	@Autowired
	PessoaFisicaService fisicaService;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	protected void LoadData() {
		setService(fisicaService);
		setMapper(mapper);
	}

}
