package ufg.api.exames.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ufg.api.exames.models.Paciente;
import ufg.api.exames.models.Protocolo;

public interface ProtocoloRepository extends JpaRepository<Protocolo, Long> {
	
	Protocolo findById(long id);
	
	List<Protocolo> findByPaciente(Paciente paciente);

}
