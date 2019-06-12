package cotxoxapp.cotxoxdatabase.Model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_conductores")
public class Conductor {
	@Id @Column(name = "co_tarjeta_credito",nullable = false)
	private String tarjeta_credito; 
	@Column(name="co_nombre")
	private String nombre = null;
	@Column(name="co_modelo")
	private String modelo = null;
	@Column(name="co_matricula")
	private String matricula = null;
	@Column(name="co_valoracion_media")
	private double valoracionMedia = 0d;
	@Column(name="co_ocupado")
	private boolean ocupado = false;
	
//	private ArrayList<Byte> valoraciones = new ArrayList<>();

	public Conductor() {
	};
	
	
	
	
	public String getTarjetaCredito() {
		return tarjeta_credito;
	}





	public String getTarjeta_credito() {
		return tarjeta_credito;
	}




	public void setTarjeta_credito(String tarjeta_credito) {
		this.tarjeta_credito = tarjeta_credito;
	}




	public double getValoracionMedia() {
		return valoracionMedia;
	}




	public void setValoracionMedia(double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Conductor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getValoracion() {
		return this.valoracionMedia;
	}

//	public int getNumeroValoraciones() {
//		return this.valoraciones.size();
//	}

//	public void setValoracion(byte valoracion) {
//		this.valoraciones.add(valoracion);
//		this.calcularValoracionMedia();
//	}

//	private double calcularValoracionMedia() {
//		int sumaValoraciones = 0;
//		for (byte valoracion : this.valoraciones) {
//			sumaValoraciones += valoracion;
//		}
//		this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
//		return this.valoracionMedia;
//	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public boolean isOcupado() {
		return this.ocupado;
	}

}
