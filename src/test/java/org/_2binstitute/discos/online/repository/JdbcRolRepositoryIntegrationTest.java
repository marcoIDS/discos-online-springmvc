package org._2binstitute.discos.online.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org._2binstitute.discos.online.domain.Rol;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JdbcRolRepositoryIntegrationTest {
	
	@Autowired
	private RolRepository rolRepository;
	
	@Test
	public void buscarPorDescripcion_ObtieneRol() {
		String descripcion = "CLIENTE";
		Rol rol = rolRepository.findByDescripcion(descripcion);
		assertNotNull(rol);
	}
	
	@Test
	private void  buscarPorDescripcion_NoObtieneRol() {
		String descripcion = "ROL_INEXISTENTE";
		Rol rol = rolRepository.findByDescripcion(descripcion);
		assertNull(rol);
	}
}
