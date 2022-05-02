package br.com.appnovo.controller.interfaces;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ICustomController<T,I> {
	
	@RequestMapping
	public ResponseEntity<List<T>> Listar();
	
	@RequestMapping("/{id}")
	public ResponseEntity<T> Item(@PathVariable(value="id") I id);	
	
	@PostMapping
	public ResponseEntity<T> Inserir(@RequestBody T item);	
	
	@PutMapping
	public ResponseEntity<T> Atualizar(@RequestBody T item);	
	
	@DeleteMapping("/{id}")
	public boolean Deletar(@PathVariable(value="id") I id);
}
