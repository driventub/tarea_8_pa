package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.repository.jpa.TarjetaCreditoRepoImpl;

@Service
public class TarjetaCreditoTransaccionImpl implements ITarjetaCreditoTransaccion {

	private static final Logger LOG = LoggerFactory.getLogger(TarjetaCreditoTransaccionImpl.class);
	@Autowired
	private ITarjetaCreditoService tarjetaService;

	@Autowired
	private IConsumoService consumoService;

	@Override
	@Transactional
	public void realizarTransaccion(BigDecimal valorConsumo, String numeroTarjeta) {
		Consumo c = new Consumo();
		TarjetaCredito t = this.tarjetaService.buscar(numeroTarjeta);

		c.setValorConsumo(valorConsumo);
		c.setFechaConsumo(LocalDateTime.now());
		c.setTarjetaCredito(t);

		this.consumoService.guardar(c);

		BigDecimal transaccion = t.getCupo().subtract(valorConsumo);
		t.setCupo(transaccion);
		

		try {
			this.tarjetaService.actualizar(t);
		} catch (NullPointerException e) {
			LOG.info("Capturado en la transaccion");
		}

	}

}
