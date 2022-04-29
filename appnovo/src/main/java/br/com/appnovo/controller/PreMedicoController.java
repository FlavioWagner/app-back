package br.com.appnovo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;

import br.com.appnovo.dto.PreMedicoDTO;
import br.com.appnovo.service.PreMedicoService;

@RestController
public class PreMedicoController<T> {
	
	@Autowired
	private PreMedicoService preMedicoService; 
	
	
	@GetMapping(value="todos")
	public ResponseEntity<List<PreMedicoDTO>> find(){
		List<PreMedicoDTO> lista = preMedicoService.find();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@GetMapping(value="porId")
	public ResponseEntity<List<PreMedicoDTO>> findByid(@RequestParam(value="idMedico",required=false) Long idMedico,
			                                          @RequestParam(value="registro",required=false) String registro){
		
		
		
	List<PreMedicoDTO> lista = idMedico == null ? preMedicoService.findById(idMedico) : preMedicoService.findByRegistro(registro);
		
	// PreMedicoDTO dto = new PreMedicoDTO(preMedicoService.findById(idMedico));
		
		
	//	List<PreMedicoDTO> lista = idMedico == null? preMedicoService.findById(idMedico) : preMedicoService.findByRegistro(registro);
		
		
		return ResponseEntity.ok().body(lista);
	}
	
	
	
	@GetMapping(value="Id")
	public ResponseEntity<PreMedicoDTO> findByid(@RequestParam(value="idMedico",required=false) Long idMedico)
			                               {
		
		
		
	//List<PreMedicoDTO> lista = idMedico == null ? preMedicoService.findById(idMedico) : preMedicoService.findByRegistro(registro);
		
	  PreMedicoDTO dto = new PreMedicoDTO(preMedicoService.findId(idMedico));
		
		
	//	List<PreMedicoDTO> lista = idMedico == null? preMedicoService.findById(idMedico) : preMedicoService.findByRegistro(registro);
		
		
		return ResponseEntity.ok().body(dto);
	}
	
	 @SuppressWarnings("unchecked")
	 @PostMapping(value = "/premedico")
	 public ResponseEntity<T> inserir(@RequestBody PreMedicoDTO dto) {
		
		dto = preMedicoService.Insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getNome()).toUri();

		return (ResponseEntity<T>) ResponseEntity.created(uri)
				.body("Sucesso");
	}
		
	
}
