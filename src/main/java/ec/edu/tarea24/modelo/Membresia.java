package ec.edu.tarea24.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "membresia")
public class Membresia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_membresia")
	@SequenceGenerator(name = "seq_membresia", sequenceName = "seq_membresia", allocationSize = 1)
	@Column(name = "memb_id")
	private Integer id;
	
	@Column(name = "memb_codigo")
	private String codigo;
	
	@Column(name = "memb_nombre")
	private String nombre;
	
	@Column(name = "memb_valor")
	private BigDecimal valor;
	
	@Column(name = "memb_vigencia")
	private LocalDateTime vigencia;
	
	@Column(name = "memb_cantidad")
	private Integer cantidad;
	
	/**
	 * Este valor esta mal, pensaba en un inicio que era un recuento de cada vez que se compraba una membresia, pero
	 * en realidad es como que se guarda una membresia compartida, que multiples personas pueden acceder a esta membresia
	 * Se tendria que realizar un count de todas los clientes que tienen esta membresia
	 * Ni siquiera teniendo dos horas para hacer el trabajo, me di cuenta de esto, recien al momento de la transasccion
	 * La logica que voy a tomar desde este punto, y esta escrito para acordarme y constantar lo que tratare de hacer, es 
	 * de que solo un cliente puede tener una membresia, pero que esa misma membresia puede usarse para multiples clientes 
	 */
//	@ManyToOne
//	@JoinColumn(name = "clie_id")
//	private Cliente cantidad;
	
	@OneToMany(mappedBy = "membresia",cascade = CascadeType.MERGE)
	private List<Cliente> cliente;
	
	@OneToMany(mappedBy = "membresia",cascade = CascadeType.MERGE)
	private List<RegistroPago> registroPago;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDateTime getVigencia() {
		return vigencia;
	}

	public void setVigencia(LocalDateTime vigencia) {
		this.vigencia = vigencia;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<RegistroPago> getRegistroPago() {
		return registroPago;
	}

	public void setRegistroPago(List<RegistroPago> registroPago) {
		this.registroPago = registroPago;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Membresia [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", valor=" + valor + ", vigencia="
				+ vigencia + ", cantidad=" + cantidad + ", cliente=" + cliente + ", registroPago=" + registroPago + "]";
	}
	
	

}
