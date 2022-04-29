package br.com.appnovo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.appnovo.repository.PreMedicoRepository;
import br.com.appnovo.service.Exceptions.ObjectNotFoundException;
import br.com.appnovo.dto.PreMedicoDTO;
import br.com.appnovo.model.PreMedico;


@Service
public class PreMedicoService {
	
	@Autowired
	private PreMedicoRepository repositorio;
	
	@Transactional
	public List<PreMedicoDTO> find(){
		
		List<PreMedico> listaPreMedico = repositorio.findAll();	
		return listaPreMedico.stream().map(x -> new PreMedicoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public PreMedicoDTO Insert(PreMedicoDTO dto) {	
		PreMedico medico = new PreMedico(dto.getCategoria(), dto.getGenero(), dto.getIdEstado(), dto.getNacionalidade(), dto.getNascimento(),
			                            dto.getNascimentoExterior(), dto.getNome(), dto.getRegistro(), dto.getRg(), dto.getRgExpedicao(), dto.getRgOrgao(),
				                        dto.getTitulo(), dto.getTituloSecao(), dto.getTituloZona(), dto.getEstado(), dto.getEstadoCivil());
	
		repositorio.save(medico);
		return new PreMedicoDTO(medico);
	}
	
	
	public List<PreMedicoDTO> findById(Long idMedico){
		Optional<PreMedico>  listaPreMedico = repositorio.findById(idMedico);
		// Exceção
	//	return listaPreMedico.orElseThrow(() -> new ObjectNotFoundException("Informação não encontrada! id:" + idMedico));
		
	///	return new PreMedicoDTO(null)
		
		//return preMedico.orElseThrow(() -> new ObjectNotFoundException("Informação não encontrada! id:" +idMedico + "Tipo: " + PreMedico.class.getName()));		
		return listaPreMedico.stream().map(x -> new PreMedicoDTO(x)).collect(Collectors.toList());
	}
	
	
	
	public PreMedico findId(Long idMedico){
		Optional<PreMedico>  preMedico = repositorio.findById(idMedico);		
		return preMedico.orElseThrow(() -> new ObjectNotFoundException("Informação não encontrada! id:" +idMedico + ". Tipo: " + PreMedico.class.getName()));		
	}
	
	
	public List<PreMedicoDTO> findByRegistro(String registro){
		List<PreMedico> listaPreMedico = repositorio.findByRegistro(registro);	
		return listaPreMedico.stream().map(x -> new PreMedicoDTO(x)).collect(Collectors.toList());
		
	}
	
	
	
	
	
	

}
	
	
	


