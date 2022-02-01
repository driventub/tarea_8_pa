package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="nutricion_papa")
public class NutricionPapa {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_nutr")
	@SequenceGenerator(name ="seq_nutr",sequenceName="seq_nutr",allocationSize = 1)
	@Column(name = "nutr_id")
	private Integer id;
	
	@Column(name = "nutr_nombre")
	private String nombre;
	
	@Column(name = "nutr_cantidad")
	private BigDecimal cantidad;
	
	@Column(name = "nutr_porcentaje")
	private Integer porcentaje;
	
	@ManyToOne
	@JoinColumn(name= "papa_id")
	private Papa papa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Papa getPapa() {
		return papa;
	}

	public void setPapa(Papa papa) {
		this.papa = papa;
	}

	@Override
	public String toString() {
		return "NutricionPapa [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", porcentaje="
				+ porcentaje + ", papa=" + papa + "]";
	}
	
	
	
	
}
