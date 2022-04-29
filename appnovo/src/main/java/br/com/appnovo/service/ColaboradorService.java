package br.com.appnovo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appnovo.repository.ColaboradorRepository;

@Service
public class ColaboradorService {
	@Autowired
	ColaboradorRepository colaboradorRepository;
	
	
}
