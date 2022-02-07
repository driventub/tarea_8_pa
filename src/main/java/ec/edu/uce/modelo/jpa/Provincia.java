package ec.edu.uce.modelo.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "provincia")
public class Provincia {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_provincia")
	@SequenceGenerator(name ="seq_provincia",sequenceName="seq_provincia",allocationSize = 1)
	@Column(name = "prov_id")
	private Integer id;
	
	@Column(name = "prov_nombre")
	private String nombre;
	
	@Column(name = "prov_region")
	private String region;
	
	@OneToOne(mappedBy = "provincia",cascade = CascadeType.ALL)
	private Capital capital;

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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	
	
}
