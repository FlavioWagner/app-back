package br.com.appnovo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;
import br.com.appnovo.dto.ColaboradorDTO;
import br.com.appnovo.service.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController implements ICustomController<ColaboradorDTO, Long> {

	@Autowired
	ColaboradorService colaboradorService;
	
	@Override
	public ResponseEntity<List<ColaboradorDTO>> Listar() {
		return ResponseEntity.ok(colaboradorService.Listar());
	}

	@Override
	public ResponseEntity<ColaboradorDTO> Item(Long id) {
		return ResponseEntity.ok(colaboradorService.Item(id));	
	}

	@Override
	public ResponseEntity<ColaboradorDTO> Inserir(ColaboradorDTO item) {
		return ResponseEntity.ok(colaboradorService.Inserir(item));	
	}

	@Override
	public ResponseEntity<ColaboradorDTO> atualizar(ColaboradorDTO item) {
		return ResponseEntity.ok(colaboradorService.Atualizar(item));
	}

	@Override
	public boolean deletar(Long id) {
		return colaboradorService.Deletar(id);
	}

}
