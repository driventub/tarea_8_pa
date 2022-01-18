package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Skate;

public interface ISkateRepo {
	
	void insertarSkate(Skate p);

	Skate buscarSkate(Integer id);

	void actualizarSkatePorId(Skate p);

	void borrarSkatePorId(Integer id);

}
