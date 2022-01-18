package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fuente_poder")
public class FuentePoder {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "voltaje")
	private Integer voltaje;
	
	@Column(name = "tipo")
//	Set y Get
	private String tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(Integer voltaje) {
		this.voltaje = voltaje;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "FuetePoder [id=" + id + ", voltaje=" + voltaje + ", tipo=" + tipo + "]";
	}
	
	
	
}
