package org._2binstitute.discos.online.repository;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org._2binstitute.discos.online.domain.Colonia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JdbcColoniaRepositoryIntegrationTest {
	@Autowired
	private ColoniaRepository coloniaRepository;
	
	@Test
	public void buscarPorCp_ObtieneColonias() {
		//jdbcColoniaRepository = new JdbcColoniaRepository();
		String cp = "10000";
		List<Colonia> colonias = coloniaRepository.buscarPorCp(cp);
		assertTrue(!colonias.isEmpty());
	}
}
 