package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="papa")
public class Papa {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_papa")
	@SequenceGenerator(name ="seq_papa",sequenceName="seq_papa",allocationSize = 1)
	@Column(name = "papa_id")
	private Integer id;
	
	@Column(name = "papa_marca")
	private String marca;
	
	@Column(name = "papa_peso")
	private BigDecimal peso;
	
	@Column(name = "papa_sabor")
	private String sabor;
	
	@Column(name = "papa_precio")
	private BigDecimal precio;

	@OneToMany(mappedBy = "papa",cascade = CascadeType.ALL)
	private List<NutricionPapa> nutricion;
	
//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<NutricionPapa> getNutricion() {
		return nutricion;
	}

	public void setNutricion(List<NutricionPapa> nutricion) {
		this.nutricion = nutricion;
	}

	@Override
	public String toString() {
		return "Papa [id=" + id + ", marca=" + marca + ", peso=" + peso + ", sabor=" + sabor + ", precio=" + precio
				+ ", nutricion=" + nutricion + "]";
	}
	
	
	
}
