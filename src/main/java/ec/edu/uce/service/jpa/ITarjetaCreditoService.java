package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoService {
	void guardar(TarjetaCredito t);
	void actualizar(TarjetaCredito t);
	TarjetaCredito buscar(String numeroTarjeta);
}
