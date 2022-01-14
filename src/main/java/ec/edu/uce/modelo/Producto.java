package ec.edu.uce.modelo;

public class Producto {
	private Integer id, precio;
	private String nombre,tipo,marca;
	
//	Get y Set	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getPrecio() {
		return precio;
	}



	public void setPrecio(Integer precio) {
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", tipo=" + tipo + ", marca="
				+ marca + "]";
	}
	

	
	
}
