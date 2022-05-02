package br.com.appnovo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.service.PessoaJuridicaService;

@RestController
@RequestMapping("/juridica")
public class PessoaJuridicaController extends CustomClassController<PessoaJuridicaService, EstadoDTO, Integer> {

	@Autowired
	PessoaJuridicaService pessoaJuridicaService;

	@Override
	protected PessoaJuridicaService getService() {
		return pessoaJuridicaService;
	}
}
