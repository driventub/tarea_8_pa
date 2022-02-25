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
@Table(name="pais")
public class Pais {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_pais")
	@SequenceGenerator(name ="seq_pais",sequenceName="seq_pais",allocationSize = 1)
	@Column(name = "pais_id")
	private Integer id;
	
	@Column(name = "pais_nombre")
	private String nombre;
	
	
	@Column(name = "pais_tamanho")
	private BigDecimal tamanho;
	
	@Column(name = "pais_poblacion")
	private Integer poblacion;
	
	@OneToMany(mappedBy = "pais",cascade = CascadeType.ALL)
	private List<Ciudad> ciudad;
	
//	Set y Get
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

	public BigDecimal getTamanho() {
		return tamanho;
	}

	public void setTamanho(BigDecimal tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}

	public List<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(List<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", tamanho=" + tamanho + ", poblacion=" + poblacion
				+ ", ciudad=" + ciudad + "]";
	}
	
	
	
	
}
