package br.com.appnovo.controller.interfaces;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ICustomController<T,I> {
	
	@RequestMapping
	public ResponseEntity<List<T>> Listar();
	
	@RequestMapping("/dados/{id}")
	public ResponseEntity<T> Item(@PathParam(value="id") I id);	
	
	@PostMapping("/dados")
	public ResponseEntity<T> Inserir(@RequestBody T item);	
	
	@PutMapping("/dados")
	public ResponseEntity<T> atualizar(@RequestBody T item);	
	
	@DeleteMapping("/dados/{id}")
	public boolean deletar(@RequestBody I id);
}
