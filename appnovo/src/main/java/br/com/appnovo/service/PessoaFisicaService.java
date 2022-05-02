package br.com.appnovo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.appnovo.dto.PessoaFisicaDTO;
import br.com.appnovo.service.interfaces.ICustomService;

@Service
public class PessoaFisicaService implements ICustomService<PessoaFisicaDTO, Long> {

	@Override
	public List<PessoaFisicaDTO> Listar() {
		return new ArrayList<PessoaFisicaDTO>();
	}

	@Override
	public PessoaFisicaDTO Item(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaFisicaDTO Inserir(PessoaFisicaDTO item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaFisicaDTO Atualizar(PessoaFisicaDTO item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Deletar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
