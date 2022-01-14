package ec.edu.uce.modelo;

public class Carro {
	private Integer id, anho, precio;
	private String modelo, marca;
	
	
//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnho() {
		return anho;
	}

	public void setAnho(Integer anho) {
		this.anho = anho;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", anho=" + anho + ", precio=" + precio + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}

}
