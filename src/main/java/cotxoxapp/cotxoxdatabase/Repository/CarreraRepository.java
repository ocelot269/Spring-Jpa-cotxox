package cotxoxapp.cotxoxdatabase.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cotxoxapp.cotxoxdatabase.Model.Carrera;

public interface CarreraRepository extends CrudRepository<Carrera, Long>{
	Optional <Carrera> findByTarjetaCredito(String tarjetaCredito);
}
