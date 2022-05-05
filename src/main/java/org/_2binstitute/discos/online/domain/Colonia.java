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
public class Colonia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	private String nombre;
	private String cp;
	
	@ManyToOne(targetEntity = Municipio.class)
	@JoinColumn(name="id_municipio", nullable=false)
	private Municipio municipio;
	
}
