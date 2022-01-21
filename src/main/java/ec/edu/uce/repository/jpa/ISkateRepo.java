package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;

import ec.edu.uce.modelo.jpa.Skate;

public interface ISkateRepo {
	
	void insertarSkate(Skate p);

	Skate buscarSkatePorId(Integer id);

	void actualizarSkatePorId(Skate p);

	void borrarSkatePorId(Integer id);
	
	Skate buscarSkatePorPrecio(BigDecimal b);
	

}
