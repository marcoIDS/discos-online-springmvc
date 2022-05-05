package org._2binstitute.discos.online.domain;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
public class PerfilId implements Serializable{
	
	private static final long serialVersionUID = 8784562601569864923L;

	private final Integer idUsuario;
	
	private final Integer idRol;	
	
}
