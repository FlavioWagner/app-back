package br.com.appnovo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.PessoaJuridicaDTO;
import br.com.appnovo.service.PessoaJuridicaService;

@RestController
@RequestMapping("/juridica")
public class PessoaJuridicaController extends CustomClassController<PessoaJuridicaService, PessoaJuridicaDTO, Integer> {

	@Autowired
	PessoaJuridicaService pessoaJuridicaService;
	
	@Autowired
	ModelMapper mapper;	
	
	@Override
	protected void LoadData() {
		setService(this.pessoaJuridicaService);
		setMapper(this.mapper);
	}
}
