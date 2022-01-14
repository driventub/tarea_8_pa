package ec.edu.uce.modelo;

public class Teclado {
	private Integer id, numTeclas;
	private String switche, keycap, tipo;
	private Boolean lubed;
	
//	Set y Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumTeclas() {
		return numTeclas;
	}
	public void setNumTeclas(Integer numTeclas) {
		this.numTeclas = numTeclas;
	}
	public String getSwitche() {
		return switche;
	}
	public void setSwitche(String switche) {
		this.switche = switche;
	}
	public String getKeycap() {
		return keycap;
	}
	public void setKeycap(String keycap) {
		this.keycap = keycap;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Boolean getLubed() {
		return lubed;
	}
	public void setLubed(Boolean lubed) {
		this.lubed = lubed;
	}
	@Override
	public String toString() {
		return "Teclado [id=" + id + ", numTeclas=" + numTeclas + ", switche=" + switche + ", keycap=" + keycap
				+ ", tipo=" + tipo + ", lubed=" + lubed + "]";
	}
		
	
	
	
}
