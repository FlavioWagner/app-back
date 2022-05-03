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

import br.com.appnovo.dto.EstadoDTO;
import br.com.appnovo.service.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController{

	@Autowired
	EstadoService estadoService;

	@RequestMapping
	public ResponseEntity<List<EstadoDTO>> Listar()
	{
		return ResponseEntity.notFound().build();
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<EstadoDTO> Item(@PathVariable(value="id") Integer id)
	{
		return ResponseEntity.ok( estadoService.Item(id));
	}
	
	@PostMapping
	public ResponseEntity<EstadoDTO> Inserir(@RequestBody EstadoDTO item)
	{
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping
	public ResponseEntity<EstadoDTO> Atualizar(@RequestBody EstadoDTO item)
	{
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public boolean Deletar(@PathVariable(value="id") Integer id)
	{
		return false;
	}
}
