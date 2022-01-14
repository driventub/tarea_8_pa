package ec.edu.uce.modelo;

public class Camara {
	private Integer id,megaPixel,apertura;
	private String marca;
	private Boolean hdr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMegaPixel() {
		return megaPixel;
	}
	public void setMegaPixel(Integer megaPixel) {
		this.megaPixel = megaPixel;
	}
	public Integer getApertura() {
		return apertura;
	}
	public void setApertura(Integer apertura) {
		this.apertura = apertura;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Boolean getHdr() {
		return hdr;
	}
	public void setHdr(Boolean hdr) {
		this.hdr = hdr;
	}
	@Override
	public String toString() {
		return "Camara [id=" + id + ", megaPixel=" + megaPixel + ", apertura=" + apertura + ", marca=" + marca
				+ ", hdr=" + hdr + "]";
	}
	
	
		
}
