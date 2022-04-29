package br.com.appnovo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;
import br.com.appnovo.dto.PreMedicoDTO;
import br.com.appnovo.service.PreMedicoService;

@RestController
@RequestMapping("/preMedicov2")
public class PreMedicoControllerv2 implements ICustomController<PreMedicoDTO, Long>{
	
	
	@Autowired
	private PreMedicoService preMedicoService;

	@Override
	public ResponseEntity<List<PreMedicoDTO>> Listar() {
	List<PreMedicoDTO> lista = preMedicoService.find();
		return  ResponseEntity.ok().body(lista);
	}

	@Override
	public ResponseEntity<PreMedicoDTO> Item(Long id) {
		return (ResponseEntity<PreMedicoDTO>) ResponseEntity.ok().body(new PreMedicoDTO(preMedicoService.findId(id)));
	}

	@Override
	public ResponseEntity<PreMedicoDTO> Inserir(PreMedicoDTO item) {
		return  ResponseEntity.ok().body( preMedicoService.Insert(item));
	}

	@Override
	public ResponseEntity<PreMedicoDTO> atualizar(PreMedicoDTO item) {
		// TODO Auto-generated method stub
	//	return ResponseEntity.ok().body( preMedicoService.(item));
		return null;
	}

	@Override
	public boolean deletar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


//	@SuppressWarnings("unchecked")
//	@Override
//	public ResponseEntity<T> Listar() {
//		List<PreMedicoDTO> lista = preMedicoService.find();
//		return (ResponseEntity<T>) ResponseEntity.ok().body(lista);//verificar a necessidade de devolver uma lista
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public ResponseEntity<T> Item(Long id) {
//		return (ResponseEntity<T>) ResponseEntity.ok().body(new PreMedicoDTO(preMedicoService.findId(id)));
//	}


	
	
	

}
