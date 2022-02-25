package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "gotas_ojo")
@NamedQuery(name="GotasOjo.buscarPorVolumen", query="select g from GotasOjo g where g.volumen=:valor")
public class GotasOjo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_gotas_ojo")
	@SequenceGenerator(name ="seq_gotas_ojo",sequenceName="seq_gotas_ojo",allocationSize = 1)
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
