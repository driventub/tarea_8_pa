package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "skate")
public class Skate {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_skate")
	@SequenceGenerator(name ="seq_skate",sequenceName="seq_skate",allocationSize = 1)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "precio")
	private BigDecimal precio;
	
	@Column(name = "marca")
	private String marca;

	
//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Skate [id=" + id + ", precio=" + precio + ", marca=" + marca + "]";
	}
	
	
}
