package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

public interface ITarjetaCreditoRepo {
	void insertar(TarjetaCredito t);
	void actualizar(TarjetaCredito t);
	TarjetaCredito buscar(String numero);
}
