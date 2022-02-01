package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Pais;

public interface IPaisRepo {
	void insertarPais(Pais p);
	void borrarPaisPorId(Integer id);
	Pais buscarPaisPorId(Integer id);
	void updatePais(Pais p);
}
