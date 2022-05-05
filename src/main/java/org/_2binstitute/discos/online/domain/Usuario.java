package org._2binstitute.discos.online.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	
	@JoinColumn(name="primer_apellido", nullable=false)
	private String primerApellido;
	
	@JoinColumn(name="segundo_apellido", nullable=false)
	private String segundoApellido;
	
	private String password;
	private String email;
	private String rfc;
		
}
