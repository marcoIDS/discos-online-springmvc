package org._2binstitute.discos.online.repository;

import org._2binstitute.discos.online.domain.Perfil;
import org._2binstitute.discos.online.domain.PerfilId;
import org.springframework.data.repository.CrudRepository;

public interface PerfilRepository extends CrudRepository<Perfil, PerfilId> {
	
}
