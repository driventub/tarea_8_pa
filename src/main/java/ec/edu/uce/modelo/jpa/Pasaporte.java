package ec.edu.uce.modelo.jpa;

import java.time.LocalDateTime;

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
@Table(name = "pasaporte")
public class Pasaporte {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_pasaporte")
	@SequenceGenerator(name ="seq_pasaporte",sequenceName="seq_pasaporte",allocationSize = 1)
	@Column(name= "pasa_id")
	private Integer id;
	
	@Column(name= "pasa_numero")
	private String numero;
	
	@Column(name= "pasa_expiracion")
	private LocalDateTime expiracion;
	
	@OneToOne
	@JoinColumn(name = "pasa_pers_id")
	private Persona persona;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getExpiracion() {
		return expiracion;
	}

	public void setExpiracion(LocalDateTime expiracion) {
		this.expiracion = expiracion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", expiracion=" + expiracion + "]";
	}

		
	
}
