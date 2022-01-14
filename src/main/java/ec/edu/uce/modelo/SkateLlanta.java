package ec.edu.uce.modelo;

public class SkateLlanta {
	private Integer id, diametro;
	private String dureza, marca, color;

//	Set y Get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public String getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {
		this.dureza = dureza;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SkateLlanta [id=" + id + ", diametro=" + diametro + ", dureza=" + dureza + ", marca=" + marca
				+ ", color=" + color + "]";
	}

}
