package cotxoxapp.cotxoxdatabase.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cotxoxapp.cotxoxdatabase.Model.Conductor;
import cotxoxapp.cotxoxdatabase.Repository.ConductorRepo;

@Service
public class ConductorService {
	
	@Autowired
	ConductorRepo conductor1;
	
	public Conductor recuperarConductor(String string) {		
		return conductor1.findOne(string);
	}

	public void crearConductor(String tarjeta, String nombre, String matricula, String modelo) {
		Conductor conductor = new Conductor();
		conductor.setTarjeta_credito(tarjeta);
		conductor.setNombre(nombre);
		conductor.setMatricula(matricula);
		conductor.setModelo(modelo);
		conductor1.save(conductor);
		
	}

	public void init() {
		
		Conductor conductor = new Conductor();
		String[] nombres = {"Sabrina", "Cici"};
		String[] matricula = {"5DHJ444", "7JKK555"};
		String[] modelos = {"Toyota Prius", "Mercedes A"};
		String[] tarjeta = {"2222222222222222","3333333333333333"};
		for (int i = 0; i < tarjeta.length; i++) {
			conductor.setTarjeta_credito(tarjeta[i]);
			conductor.setNombre(nombres[i]);
			conductor.setMatricula(matricula[0]);
			conductor.setModelo(modelos[0]);
			conductor1.save(conductor);
		}

		
	}

	public Conductor recuperarConductorLibre() {
		return conductor1.findByLibre().get(0);
	}

}
