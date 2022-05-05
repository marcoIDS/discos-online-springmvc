package org._2binstitute.discos.online.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Domicilio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String calle;
	private String numExterior;
	private String numInterior;
	
	@ManyToOne(targetEntity = Usuario.class)
	@JoinColumn(name="id_usuario", nullable=false)
	private Usuario usuario;
	
	@ManyToOne(targetEntity = Colonia.class)
	@JoinColumn(name="id_colonia", nullable=false)
	private Colonia colonia;
	
	@ManyToOne(targetEntity = TipoDomicilio.class)
	@JoinColumn(name="id_tipo_domicilio", nullable=false)
	private TipoDomicilio tipoDomicilio;
	
}
