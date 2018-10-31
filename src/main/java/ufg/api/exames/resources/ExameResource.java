package ufg.api.exames.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufg.api.exames.models.Protocolo;
import ufg.api.exames.repository.PacienteRepository;
import ufg.api.exames.repository.ProtocoloRepository;

@RestController
@RequestMapping(value="/api/exames")
public class ExameResource {
	
	@Autowired
	ProtocoloRepository protocoloRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@GetMapping("/protocolo/{id}")
	public Protocolo getExamesProtocolo(@PathVariable(value="id") long id) {
		return protocoloRepository.findById(id);
	}
	
	@GetMapping("/paciente/{cpf}")
	public List<Protocolo> getExamesPaciente(@PathVariable(value="cpf") String cpf) {
		return protocoloRepository.findByPaciente(pacienteRepository.findByCpf(cpf));
	}

}
