package br.com.appnovo.controller;

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

import br.com.appnovo.dto.ColaboradorDTO;
import br.com.appnovo.service.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController{

	@Autowired
	ColaboradorService colaboradorService;

	@RequestMapping
	public ResponseEntity<List<ColaboradorDTO>> Listar()
	{
		return ResponseEntity.notFound().build();
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<ColaboradorDTO> Item(@PathVariable(value="id") Long id)
	{
		return ResponseEntity.ok( colaboradorService.Item(id));
	}
	
	@PostMapping
	public ResponseEntity<ColaboradorDTO> Inserir(@RequestBody ColaboradorDTO item)
	{
		return ResponseEntity.ok(colaboradorService.Inserir(item));
	}
	
	@PutMapping
	public ResponseEntity<ColaboradorDTO> Atualizar(@RequestBody ColaboradorDTO item)
	{
		return ResponseEntity.ok(colaboradorService.Atualizar(item));
	}
	
	@DeleteMapping("/{id}")
	public boolean Deletar(@PathVariable(value="id") Long id)
	{
		return colaboradorService.Deletar(id);
	}
}
