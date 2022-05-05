package org._2binstitute.discos.online.repository;
import java.util.List;
import org._2binstitute.discos.online.domain.Colonia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ColoniaRepository extends CrudRepository<Colonia, Integer>{
	
	@Query("SELECT c FROM Colonia c INNER JOIN c.municipio m INNER JOIN m.estado e WHERE c.cp = :cp")
	List<Colonia> buscarPorCp(String cp);
	
}
