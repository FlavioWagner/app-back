package br.com.appnovo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appnovo.controller.interfaces.ICustomController;
import br.com.appnovo.dto.PessoaJuridicaDTO;
import br.com.appnovo.service.PessoaJuridicaService;

@RestController
@RequestMapping("/juridica")
public class PessoaJuridicaController implements ICustomController<PessoaJuridicaDTO, Long> {

	@Autowired
	PessoaJuridicaService pessoaJuridicaService;
	
	@Override
	public ResponseEntity<List<PessoaJuridicaDTO>> Listar() {
		return ResponseEntity.ok(pessoaJuridicaService.Listar());
	}

	@Override
	public ResponseEntity<PessoaJuridicaDTO> Item(Long id) {
		return ResponseEntity.ok(pessoaJuridicaService.Item(id));	
	}

	@Override
	public ResponseEntity<PessoaJuridicaDTO> Inserir(PessoaJuridicaDTO item) {
		return ResponseEntity.ok(pessoaJuridicaService.Inserir(item));	
	}

	@Override
	public ResponseEntity<PessoaJuridicaDTO> atualizar(PessoaJuridicaDTO item) {
		return ResponseEntity.ok(pessoaJuridicaService.Atualizar(item));
	}

	@Override
	public boolean deletar(Long id) {
		return pessoaJuridicaService.Deletar(id);
	}

}
