package ec.edu.uce.modelo;

public class Libro {
	private Integer id, anho;
	private String nombre, editorial, autor;

//	Get y Set

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", anho=" + anho + ", nombre=" + nombre + ", editorial=" + editorial + ", autor="
				+ autor + "]";
	}

}
