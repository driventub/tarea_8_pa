package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Skate;

public interface ISkateService {
	void guardar(Skate g);
	void actualizar(Skate g);
	Skate buscar(Integer i);
	void eliminar(Integer i);
}
