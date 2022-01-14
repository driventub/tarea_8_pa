package ec.edu.uce.modelo;

public class Monitor {
	private Integer id, hercios, tamanho;
	private String tipo, resolucion;
//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHercios() {
		return hercios;
	}

	public void setHercios(Integer hercios) {
		this.hercios = hercios;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Monitor [id=" + id + ", hercios=" + hercios + ", tamanho=" + tamanho + ", tipo=" + tipo
				+ ", resolucion=" + resolucion + "]";
	}
	
	
}
