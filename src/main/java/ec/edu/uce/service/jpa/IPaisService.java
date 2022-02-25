package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Pais;

public interface IPaisService {
	void guardar(Pais p);
	void eliminar(Integer id);
	Pais buscar(Integer id);
	void actualizar(Pais p);
}
