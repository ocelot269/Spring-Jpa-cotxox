package cotxoxapp.cotxoxdatabase.Servicio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cotxoxapp.cotxoxdatabase.Model.Carrera;
import cotxoxapp.cotxoxdatabase.Repository.CarreraRepository;

@Service

public class CarreraService {
	
	@Autowired
	CarreraRepository carrera;
	

	public Long crearCarrera(String tarjeta, String origen, String destino, int tiempoEsperado, int tiempoCarrera) {
		Carrera carrerita = new Carrera();
		carrerita.setTarjetaCredito(tarjeta);
		carrerita.setOrigen(origen);
		carrerita.setDestino(destino);
		carrerita.setTiempoEsperado(tiempoEsperado);
		carrerita.setTiempoEsperado(tiempoCarrera);
		carrera.save(carrerita);
		return carrera.findByTarjetaCredito(tarjeta).get().getId();	
	}

	public Carrera recuperaCarrera(Long idCarrera) {
		return carrera.findOne(idCarrera);
	}

	public void updateCarrera(Carrera carrera2) {
		carrera.save(carrera2);
	}
}
