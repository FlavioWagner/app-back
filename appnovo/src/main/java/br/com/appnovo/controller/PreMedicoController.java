package br.com.appnovo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.dto.PreMedicoDTO;
import br.com.appnovo.service.PreMedicoService;

@RestController
@RequestMapping("/premedico")
public class PreMedicoController{
	
	@Autowired
	private PreMedicoService preMedicoService;
	
	@RequestMapping
	public ResponseEntity<List<PreMedicoDTO>> Listar()
	{
		return ResponseEntity.ok(preMedicoService.Listar());
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<PreMedicoDTO> Item(@PathVariable(value="id") Long id)
	{
		return ResponseEntity.ok( preMedicoService.Item(id));
	}
	
	@PostMapping
	public ResponseEntity<PreMedicoDTO> Inserir(@RequestBody PreMedicoDTO item)
	{
		return ResponseEntity.ok(preMedicoService.Inserir(item));
	}
	
	@PutMapping
	public ResponseEntity<PreMedicoDTO> Atualizar(@RequestBody PreMedicoDTO item)
	{
		return ResponseEntity.ok(preMedicoService.Atualizar(item));
	}
	
	@DeleteMapping("/{id}")
	public boolean Deletar(@PathVariable(value="id") Long id)
	{
		return preMedicoService.Deletar(id);
	}
}
