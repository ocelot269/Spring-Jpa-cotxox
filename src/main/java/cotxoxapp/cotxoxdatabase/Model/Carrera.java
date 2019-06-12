package cotxoxapp.cotxoxdatabase.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "t_carreras")
public class Carrera {
	@Id @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
	@Column(name = "c_id")
	private Long id ;
	@Column(name = "c_tarjeta_credito",nullable = false )
	private String tarjetaCredito = null;
	@Column (name ="c_origen")
	private String origen = null;
	@Column(name = "c_destino")
	private String destino = null;
	@Column (name = "c_distancia")
	private double distancia = 0d;
	@Column (name = "c_tiempo_esperado")
	private int tiempoEsperado = 0;
	@Column (name = "c_tiempo_carrera")
	private int tiempoCarrera = 0;
	@Column (name = "c_coste_total")
	private double costeTotal = 0;
	@Column (name = "c_propina")
	private int propina = 0;
	@ManyToOne
	@JoinColumn(name="c_conductor")
	private Conductor conductor = null;

	
	
	
	
	public Carrera() {

	}

	
	

	public void setId(Long id) {
		this.id = id;
	}




	public String getOrigen() {
		return origen;
	}




	public void setOrigen(String origen) {
		this.origen = origen;
	}




	public String getDestino() {
		return destino;
	}




	public Long getId() {
		return id;
	}




	public void setDestino(String destino) {
		this.destino = destino;
	}




	public double getDistancia() {
		return distancia;
	}




	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}




	public int getTiempoEsperado() {
		return tiempoEsperado;
	}




	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}




	public int getTiempoCarrera() {
		return tiempoCarrera;
	}




	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}




	public double getCosteTotal() {
		return costeTotal;
	}




	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}




	public int getPropina() {
		return propina;
	}




	public void setPropina(int propina) {
		this.propina = propina;
	}




	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}


	public Conductor getConductor() {
		return conductor;
	}


	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}


	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}


	public void liberarConductor() {
		getConductor().setOcupado(false);
	}


	public String getTarjetaCredito() {
		return this.tarjetaCredito;
		
	}
}
