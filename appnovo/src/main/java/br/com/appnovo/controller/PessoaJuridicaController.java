package br.com.appnovo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;
import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.dto.PessoaJuridicaDTO;
import br.com.appnovo.service.EstadoService;
import br.com.appnovo.service.PessoaJuridicaService;

@RestController
@RequestMapping("/juridica")
public class PessoaJuridicaController  extends CustomClassController<PessoaJuridicaService, EstadoDTO, Integer> {

	@Autowired
	PessoaJuridicaService pessoaJuridicaService;

	@Override
	protected PessoaJuridicaService getService() {
		return pessoaJuridicaService;
	}
	


}
