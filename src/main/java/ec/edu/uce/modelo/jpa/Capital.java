package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "capital")
public class Capital {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_capital")
	@SequenceGenerator(name ="seq_capital",sequenceName="seq_capital",allocationSize = 1)
	@Column(name= "capi_id")
	private Integer id;
	
	@Column(name= "capi_nombre")
	private String nombre;
	
	@Column(name= "capi_poblacion")
	private Integer poblacion;
	
	@OneToOne
	@JoinColumn(name = "capi_prov_id")
	private Provincia provincia;

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

	public Integer getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
}
