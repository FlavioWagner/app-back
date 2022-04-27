package br.org.cfm.central.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeService {

	@ResponseBody 
	@RequestMapping("")
	public Descricao Home() {
		return new Descricao("JSON Content!");
	}
	
}

