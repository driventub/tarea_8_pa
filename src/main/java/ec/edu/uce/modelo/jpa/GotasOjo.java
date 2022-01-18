package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gotas_ojo")
public class GotasOjo {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "concentracion")
	private Integer concentracion;
	
	@Column(name = "volumen")
	private Integer volumen;

//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(Integer concentracion) {
		this.concentracion = concentracion;
	}

	public Integer getVolumen() {
		return volumen;
	}

	public void setVolumen(Integer volumen) {
		this.volumen = volumen;
	}

	@Override
	public String toString() {
		return "GotasOjo [id=" + id + ", concentracion=" + concentracion + ", volumen=" + volumen + "]";
	}
	
	
	
}
