
package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.HistoricoRetiro;
import ec.edu.uce.modelo.jpa.ReporteCuentaHabienteVIP;
import ec.edu.uce.modelo.jpa.ReporteHistoricoRetiro;

@Service
public class OperacionesServiceImpl implements IOperacionesService{
	private  final Logger LOG = LoggerFactory.getLogger(OperacionesServiceImpl.class);
	
	@Autowired
	private ICuentaBancariaService bancService; 
	
	@Autowired
	private IHistoricoRetiroService retiroService;
	
	@Autowired
	private ICuentaHabienteService habienteService;
	
	
	
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
	
//	Aqui pongo los filtros
	@Override
	public void calcularSaldoLambda(BigDecimal saldo) {	
		List<ReporteCuentaHabienteVIP> lista = this.habienteService.buscarReporteCuentaHabiente();
		
//		for(ReporteCuentaHabienteVIP r : lista) {
//			LOG.info(r.toString());
//		}
		Stream<ReporteCuentaHabienteVIP> listaCambiada = lista.stream().filter(r -> r.getSaldo().compareTo(saldo)>0);
		listaCambiada.forEach(p -> LOG.info(p.toString()));
		
	}

	@Override
	public void calcularReporteLambda(LocalDateTime fechaRetiro, BigDecimal montoRetiro) {
		List<ReporteHistoricoRetiro> lista = this.retiroService.buscarReporteHistorico();
		Stream<ReporteHistoricoRetiro> listaCambiada = lista.stream().filter(r -> r.getMontoRetiro().compareTo(montoRetiro)>0 || r.getFechaRetiro().isBefore(fechaRetiro));
		listaCambiada.forEach(p -> LOG.info(p.toString()));
	}

}
