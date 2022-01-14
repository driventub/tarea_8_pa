package ec.edu.uce.modelo;

public class Telefono {
	private Integer id;
	private String nombre,marca,sistema;
	private Boolean nfc;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public Boolean getNfc() {
		return nfc;
	}
	public void setNfc(Boolean nfc) {
		this.nfc = nfc;
	}
	@Override
	public String toString() {
		return "Telefono [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", sistema=" + sistema + ", nfc="
				+ nfc + "]";
	}
	

		
}
