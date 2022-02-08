package ec.edu.uce.modelo.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_persona")
	@SequenceGenerator(name ="seq_persona",sequenceName="seq_persona",allocationSize = 1)
	@Column(name = "pers_id")
	private Integer id;
	
	
	@Column(name = "pers_nombre")
	private String nombre;
	
	
	@Column(name = "pers_edad")
	private Integer edad;
	
	@OneToOne(mappedBy = "persona",cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	private Pasaporte pasaporte;

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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", pasaporte=" + pasaporte + "]";
	}
	
	
	
	
}
