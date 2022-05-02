package br.com.appnovo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appnovo.dto.PreMedicoDTO;
import br.com.appnovo.model.PreMedico;
import br.com.appnovo.repository.PreMedicoRepository;
import br.com.appnovo.service.Exception.ObjectNotFoundException;
import br.com.appnovo.service.interfaces.ICustomService;


@Service
public class PreMedicoService implements ICustomService<PreMedicoDTO, Long>{
	
	@Autowired
	private PreMedicoRepository repositorio;
	
	@Override
	public List<PreMedicoDTO> Listar(){
		
		List<PreMedico> listaPreMedico = repositorio.findAll();	
		return listaPreMedico.stream().map(x -> new PreMedicoDTO(x)).collect(Collectors.toList());
	}
	
	@Override
	public PreMedicoDTO Inserir(PreMedicoDTO dto) {	
		PreMedico medico = new PreMedico(dto.getCategoria(), dto.getGenero(), dto.getIdEstado(), dto.getNacionalidade(), dto.getNascimento(),
			                            dto.getNascimentoExterior(), dto.getNome(), dto.getRegistro(), dto.getRg(), dto.getRgExpedicao(), dto.getRgOrgao(),
				                        dto.getTitulo(), dto.getTituloSecao(), dto.getTituloZona(), dto.getEstado(), dto.getEstadoCivil());
	
		repositorio.save(medico);
		return new PreMedicoDTO(medico);
	}
	
	@Override
	public PreMedicoDTO Atualizar(PreMedicoDTO dto) {
		
		PreMedico medico = repositorio.findById(dto.getid()).get();

		//listaPreMedico.stream().map(x -> new PreMedicoDTO(x)).collect(Collectors.toList());
		
		repositorio.save(medico);
		return new PreMedicoDTO(medico);
	}

	@Override
	public PreMedicoDTO Item(Long id) {
		Optional<PreMedico>  preMedico = repositorio.findById(id);		
		return new PreMedicoDTO( preMedico.orElseThrow(() -> new ObjectNotFoundException("Informação não encontrada! id:" + id + "Tipo: " + PreMedico.class.getName())));
	}

	@Override
	public boolean Deletar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	private PreMedico findByRegistro(String registro){
		Optional<PreMedico>preMedico = repositorio.findByRegistro(registro);	
		return preMedico.orElseThrow(() -> new ObjectNotFoundException("Informação não encontrada! id:" +registro + "Tipo: " + PreMedico.class.getName()));	
		
	}	
	
	
	

}
	
	
	


