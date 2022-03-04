
package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.HistoricoRetiro;

@Service
public class OperacionesServiceImpl implements IOperacionesService{
	private  final Logger LOG = LoggerFactory.getLogger(OperacionesServiceImpl.class);
	
	@Autowired
	private ICuentaBancariaService bancService; 
	
	@Autowired
	private IHistoricoRetiroService retiroService;
	
	@Override
	@Transactional
	public void realizarRetiro(String numCuenta, BigDecimal valorRetiro) {
		CuentaBancaria c = this.bancService.buscarPorNumCuenta(numCuenta);
		
		HistoricoRetiro h = new HistoricoRetiro();
		
		BigDecimal transaccion = c.getSaldo().subtract(valorRetiro);
		c.setSaldo(transaccion);
		
		try {
			this.bancService.updateCuentaBancaria(c);
		}catch(NullPointerException e) {
			LOG.error("Persistio la excepcion");
		}
		
		
		h.setCuentaBancaria(c);
		h.setCuentaHabiente(c.getCuentaHabiente());
		h.setMontoRetiro(valorRetiro);
		h.setFechaRetiro(LocalDateTime.now());
		
		this.retiroService.insertarHistoricoRetiro(h);
		
		
	}

}
