package org._2binstitute.discos.online.repository;

import org._2binstitute.discos.online.domain.Rol;
import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<Rol, Integer>{

	Rol findByDescripcion(String descripcion);
}
