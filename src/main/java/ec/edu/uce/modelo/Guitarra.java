package ec.edu.uce.modelo;

public class Guitarra {
	private Integer id, precio;
	private String tipoCuerda, tipo,marca;
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
	public String getTipoCuerda() {
		return tipoCuerda;
	}
	public void setTipoCuerda(String tipoCuerda) {
		this.tipoCuerda = tipoCuerda;
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
		return "Guitarra [id=" + id + ", precio=" + precio + ", tipoCuerda=" + tipoCuerda + ", tipo=" + tipo
				+ ", marca=" + marca + "]";
	}
	
	
}
