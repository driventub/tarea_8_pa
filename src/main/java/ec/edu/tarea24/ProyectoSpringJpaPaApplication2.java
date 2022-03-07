package ec.edu.tarea24;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.tarea24.modelo.Cliente;
import ec.edu.tarea24.modelo.Membresia;
import ec.edu.tarea24.service.IClienteService;
import ec.edu.tarea24.service.IGestorService;
import ec.edu.tarea24.service.IMembresiaService;


/**
 * Funciona hasta el momento de agregar mas clientes a una membresia, ahi cae con un error con el cascade,
 * supuestamente se arregla con CascadeType.SAVE_UPDATE, pero es otra libreria en vez de javax, por ahi no entro
 * @author aldaz
 *
 */


@SpringBootApplication

public class ProyectoSpringJpaPaApplication2 implements CommandLineRunner {
	@Autowired
	private IGestorService gestor;
	
	@Autowired
	private IClienteService cliente;
	
	@Autowired
	private IMembresiaService membresia;
	
	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaPaApplication2.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaPaApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Tarea 24
		List<Cliente> listaCliente = new ArrayList<>();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Membresia m1 = new Membresia();
		
		c1.setNombre("Alonso");
		c1.setApellido("Smith");
		c1.setCedula("189753749-3");
		c1.setFechaNacimiento(LocalDateTime.of(1990,Month.DECEMBER,8,12,45));
		c1.setEstado("N");
//		c1.setMembresia(m1);
		
		c2.setNombre("Alfonsina");
		c2.setApellido("Smith");
		c2.setCedula("134553749-3");
		c2.setFechaNacimiento(LocalDateTime.of(1993,Month.DECEMBER,12,12,45));
		c2.setEstado("N");
//		c2.setMembresia(m1);
		
		listaCliente.add(c1);
		listaCliente.add(c2);
		
//		Pues deberia ser todo lo que tendria, dado que no se tiene
//		ninguna membresia activa(es decir, pagada)
		m1.setCodigo("377272");	
		m1.setCliente(listaCliente);
		
//		this.cliente.insertarCliente(c1);
//		this.cliente.insertarCliente(c2);
//		
//		Para que aqui valga, le cambie a MERGE el cascadeType
		
//		this.membresia.insertarMembresia(m1);
		
		this.gestor.pagarMembresia(c1.getCedula(),m1.getCodigo());
	}

}
