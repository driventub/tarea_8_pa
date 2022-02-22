package ec.edu.uce.modelo.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta_credito")
public class TarjetaCredito {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq_tarj")
	@SequenceGenerator(name ="seq_tarj",sequenceName="seq_tarj",allocationSize = 1)
	@Column(name = "tarj_id")
	private Integer id;
	
	@Column(name = "tarj_numero_tarjeta")
	private String numeroTarjeta;
	
	@Column(name = "tarj_cedula_propietario")
	private String cedulaPropietario;
	
	@Column(name = "cupo")
	private BigDecimal cupo;
	
	@OneToMany(mappedBy = "tarjetaCredito",cascade = CascadeType.ALL)
	private List<Consumo> consumo;
	
//	Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	public BigDecimal getCupo() {
		return cupo;
	}

	public void setCupo(BigDecimal cupo) {
		this.cupo = cupo;
	}

	public List<Consumo> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<Consumo> consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", cedulaPropietario="
				+ cedulaPropietario + ", cupo=" + cupo + ", consumo=" + consumo + "]";
	}

	
	
	
}
