package ufg.api.exames.models;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_PROTOCOLO")
public class Protocolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Paciente paciente;
	
	@ManyToOne
	private Medico medico;
	
	@NotNull
	private String status;
	
	@JsonIgnoreProperties("protocolo")
	@Valid
	@NotEmpty
	@OneToMany(mappedBy = "protocolo", cascade = CascadeType.ALL, orphanRemoval = true)
	private Collection<ItemProtocolo> itensProtocolo;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<ItemProtocolo> getItensProtocolo() {
		return itensProtocolo;
	}

	public void setItensProtocolo(Collection<ItemProtocolo> itensProtocolo) {
		this.itensProtocolo = itensProtocolo;
	}

	public Long getId() {
		return id;
	}

}
