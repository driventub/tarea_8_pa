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
@Table(name = "esfero")
@NamedQuery(name="Esfero.buscarPorColor", query="select g from Esfero g where g.color=:valor")
public class Esfero {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_esfero")
	@SequenceGenerator(name ="seq_esfero",sequenceName="seq_esfero",allocationSize = 1)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "color")
	private String color;

//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Esfero [id=" + id + ", tipo=" + tipo + ", color=" + color + "]";
	}
	
	
}
