package cotxoxapp.cotxoxdatabase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cotxoxapp.cotxoxdatabase.Model.Conductor;

public interface ConductorRepo extends CrudRepository<Conductor, String> {
	@Query("select c from Conductor c where c.ocupado = ?1")
	List<Conductor> findByOcupado(int i);
	@Query("select c from Conductor c where c.ocupado = false")
	List <Conductor> findByLibre();
}
