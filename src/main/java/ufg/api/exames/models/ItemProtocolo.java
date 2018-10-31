package ufg.api.exames.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TB_ITEM_PROTOCOLO")
public class ItemProtocolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@NotNull
	private Protocolo protocolo;
	
	@OneToOne
	@NotNull
	private Exame exame;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private LocalDateTime dataLiberacaoPrevista;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDateTime dataLiberacao;
	
	private String observacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public String getDataLiberacaoPrevista() {
		return dataLiberacaoPrevista.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public void setDataLiberacaoPrevista(LocalDateTime dataLiberacaoPrevista) {
		this.dataLiberacaoPrevista = dataLiberacaoPrevista;
	}

	public String getDataLiberacao() {
		return dataLiberacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
	}

	public void setDataLiberacao(LocalDateTime dataLiberacao) {
		this.dataLiberacao = dataLiberacao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
