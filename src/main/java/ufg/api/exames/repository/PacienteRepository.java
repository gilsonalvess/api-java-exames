package ufg.api.exames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufg.api.exames.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	
	Paciente findByCpf(String cpf);

}
