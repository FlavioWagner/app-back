package br.com.appnovo.controller;

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
	
	@Override
	protected PreMedicoService getService() {
		return this.preMedicoService;
	}
}
