package org._2binstitute.discos.online.repository;
import org._2binstitute.discos.online.domain.TipoDomicilio;
import org.springframework.data.repository.CrudRepository;

public interface TipoDomicilioRepository extends CrudRepository<TipoDomicilio, Integer>{
	 	
	TipoDomicilio findByDescripcion(String descripcion);
	
}
