package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;

import javax.persistence.Transient;



public class ReporteCuentaHabienteVIP {

	private String cedula;

	private String nombre;

	private String apellido;

	private String numCuenta;

	private String tipo;
	
	private BigDecimal saldo;

	public ReporteCuentaHabienteVIP() {

	}

	public ReporteCuentaHabienteVIP(String cedula, String nombre, String apellido, String numCuenta, String tipo,
			BigDecimal saldo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numCuenta = numCuenta;
		this.tipo = tipo;
		this.saldo = saldo;
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

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ReporteCuentaHabienteVIP [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", numCuenta=" + numCuenta + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}

}
