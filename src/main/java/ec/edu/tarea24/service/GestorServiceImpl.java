package ec.edu.tarea24.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.tarea24.modelo.Cliente;
import ec.edu.tarea24.modelo.FacturaElectronica;
import ec.edu.tarea24.modelo.Membresia;
import ec.edu.tarea24.modelo.RegistroPago;


@Service
public class GestorServiceImpl implements IGestorService{
	
	@Autowired
	private IClienteService cliente;
	
	@Autowired
	private IMembresiaService membresia;
	
	@Autowired
	private IRegistroPagoService registroPago;
	
	@Autowired
	private IFacturaElectronicaService facturaElectronica;
	
	@Override
	@Transactional
	public void pagarMembresia(String cedula, String codigoMembresia) {
		Cliente c = this.cliente.buscarClientePorCedula(cedula); 
		Membresia m = this.membresia.buscarMembresiaPorCodigo(codigoMembresia);
		RegistroPago p = new RegistroPago();
		FacturaElectronica f = new FacturaElectronica();
//		List<Cliente> listaCliente = this.cliente.buscarListaClientes(m.getId());
		
		m.setNombre("Doble Delux");
		m.setValor(new BigDecimal("20.22"));
		m.setVigencia(LocalDateTime.of(2023,Month.AUGUST,8,12,45));
//		m.setCantidad(listaCliente.size());
		
		this.membresia.updateMembresia(m);
		
		p.setFechaPago(LocalDateTime.now());
		p.setValorPago(m.getValor());
		p.setCliente(c);
		p.setMembresia(m);
		
		this.registroPago.insertarRegistroPago(p);
		
		
		c.setEstado("P");
		this.cliente.updateCliente(c);
//		
//		for(Cliente clie: listaCliente) {
//			clie.setEstado("P");
//			this.cliente.updateCliente(clie);
//		}
			
			
		
		
		
		
		

		f.setCedula(c.getCedula());
		f.setValorPago(p.getValorPago());
		f.setFechaPago(p.getFechaPago());
		this.facturaElectronica.insertarFacturaElectronica(f);
		
		
		
		
		
	}

}
