package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.Skate;

public interface ISkateRepo {

	void insertarSkate(Skate p);

	Skate buscarSkatePorId(Integer id);

	void actualizarSkatePorId(Skate p);

	void borrarSkatePorId(Integer id);

	Skate buscarSkatePorPrecio(BigDecimal b);

	Skate buscarSkatePorPrecioTyped(BigDecimal b);

	Skate buscarSkatePorPrecioNamed(BigDecimal b);

	Skate buscarSkatePorPrecioNative(BigDecimal b);

	Skate buscarSkatePorPrecioCriteriaApi(BigDecimal b);

}
