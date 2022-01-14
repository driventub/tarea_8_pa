package ec.edu.uce.modelo;

public class Audifono {
	private Integer id;
	private String tipo, color,marca;
	private Boolean ruidoCancel;
	
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Boolean getRuidoCancel() {
		return ruidoCancel;
	}
	public void setRuidoCancel(Boolean ruidoCancel) {
		this.ruidoCancel = ruidoCancel;
	}
	@Override
	public String toString() {
		return "Audifono [id=" + id + ", tipo=" + tipo + ", color=" + color + ", marca=" + marca + ", ruidoCancel="
				+ ruidoCancel + "]";
	}
	
	
	
}
