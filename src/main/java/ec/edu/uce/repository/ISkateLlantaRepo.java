package ec.edu.uce.repository;

import ec.edu.uce.modelo.SkateLlanta;

public interface ISkateLlantaRepo {
	void insertarSkateLlanta(SkateLlanta p);
	SkateLlanta buscarSkateLlanta(Integer id);
	void actualizarSkateLlanta(SkateLlanta p, Integer i);
	void borrarSkateLlanta(Integer id);
}
