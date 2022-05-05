package org._2binstitute.discos.online.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@IdClass(PerfilId.class)
@Entity
public class Perfil {
	@Id 
	@Column(name = "id_usuario")
	private final Integer idUsuario;
	
	@Id 
	@Column(name = "id_rol")
	private final Integer idRol;
	
	@ManyToOne(targetEntity = Usuario.class)
	@JoinColumn(name="id_usuario", nullable=false, insertable=false, updatable=false)
	private final Usuario usuario;
	
	@ManyToOne(targetEntity = Rol.class)
	@JoinColumn(name="id_rol", nullable=false, insertable=false, updatable=false)
	private final Rol rol;
	
	public Perfil(Usuario usuario, Rol rol) {
		this.usuario = usuario;
		this.rol = rol;
		this.idUsuario = usuario.getId();
		this.idRol = rol.getId();
	}
}
