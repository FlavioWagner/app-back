package br.com.appnovo.controller;

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

	@Override
	protected ColaboradorService getService() {
		return this.colaboradorService;
	}
}
