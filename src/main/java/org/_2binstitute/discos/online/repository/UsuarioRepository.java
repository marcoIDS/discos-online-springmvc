package org._2binstitute.discos.online.repository;
import org._2binstitute.discos.online.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	Usuario findByEmail(String email);
	
}
