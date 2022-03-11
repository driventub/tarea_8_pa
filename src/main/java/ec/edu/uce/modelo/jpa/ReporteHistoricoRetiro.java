package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteHistoricoRetiro {

	private String cedula;

	private String nombre;

	private String apellido;

	private BigDecimal montoRetiro;

	private LocalDateTime fechaRetiro;

	public ReporteHistoricoRetiro() {

	}

	public ReporteHistoricoRetiro(String cedula, String nombre, String apellido, BigDecimal montoRetiro,
			LocalDateTime fechaRetiro) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.montoRetiro = montoRetiro;
		this.fechaRetiro = fechaRetiro;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}

	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}

	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	@Override
	public String toString() {
		return "ReporteHistoricoRetiro [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", montoRetiro=" + montoRetiro + ", fechaRetiro=" + fechaRetiro + "]";
	}

}
