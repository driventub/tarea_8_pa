package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.Skate;

public interface ISkateService {
	void guardar(Skate g);

	void actualizar(Skate g);

	Skate buscar(Integer i);

	void eliminar(Integer i);

	Skate buscarPrecio(BigDecimal precio);

	Skate buscarPrecioTyped(BigDecimal precio);

	Skate buscarPrecioNamed(BigDecimal precio);

	Skate buscarPrecioNative(BigDecimal precio);

	Skate buscarPrecioCriteriaAPI(BigDecimal precio);
}
