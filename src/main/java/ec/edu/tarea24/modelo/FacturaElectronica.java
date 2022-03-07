package ec.edu.tarea24.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura_electronica")
public class FacturaElectronica {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fact_elec")
	@SequenceGenerator(name = "seq_fact_elec", sequenceName = "seq_fact_elec", allocationSize = 1)
	@Column(name = "fact_elec_id")
	private Integer id;
	
	@Column(name = "fact_elec_cedula")
	private String cedula;
	
	@Column(name = "fact_elec_fpago")
	private LocalDateTime fechaPago;
	
	@Column(name = "fact_elec_vPago")
	private BigDecimal valorPago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	@Override
	public String toString() {
		return "FacturaElectronica [id=" + id + ", cedula=" + cedula + "]";
	}
	
	
	
	
	
	
}
