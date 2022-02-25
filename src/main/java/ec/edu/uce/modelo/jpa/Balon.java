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
@Table(name = "balon")
@NamedQuery(name="Balon.buscarPorMarca", query="select g from Balon g where g.marca=:valor")
//@NamedQueries({
//@NamedQuery(name="Guardia.buscarPorApellido", query="select g from Guardia g where g.apellido=:valor"),
//@NamedQuery(name="Guardia.buscarPorApellido1", query="select g from Guardia g where g.apellido=:valor")
//})
public class Balon {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_balon")
	@SequenceGenerator(name ="seq_balon",sequenceName="seq_balon",allocationSize = 1)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "tamanho")
	private Integer tamanho;
	
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

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Balon [id=" + id + ", marca=" + marca + ", tamanho=" + tamanho + "]";
	}
	
	
}
