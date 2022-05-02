package br.com.appnovo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;
import br.com.appnovo.dto.ColaboradorDTO;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController implements ICustomController<ColaboradorDTO, Long> {

	@Override
	public ResponseEntity<List<ColaboradorDTO>> Listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ColaboradorDTO> Item(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ColaboradorDTO> Inserir(ColaboradorDTO item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ColaboradorDTO> atualizar(ColaboradorDTO item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
