package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

public interface ITarjetaCreditoTransaccion {
	void realizarTransaccion(BigDecimal valorConsumo, String numeroTarjeta);
}
