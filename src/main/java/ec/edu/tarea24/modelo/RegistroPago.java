package ec.edu.tarea24.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "registro_pago")
public class RegistroPago {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_reg_pago")
	@SequenceGenerator(name ="seq_reg_pago",sequenceName="seq_reg_pago",allocationSize = 1)
	@Column(name = "regp_id")
	private Integer id;
	
	@Column(name = "regp_fecha_pago")
	private LocalDateTime fechaPago;
	
	@Column(name = "regp_val_pago")
	private BigDecimal valorPago;
	
	@ManyToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "memb_id")
	private Membresia membresia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}

	@Override
	public String toString() {
		return "RegistroPago [id=" + id + ", fechaPago=" + fechaPago + ", valorPago=" + valorPago +  "]";
	}
	
	
	
	
}
