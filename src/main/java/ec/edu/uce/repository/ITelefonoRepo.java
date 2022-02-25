package ec.edu.uce.repository;

import ec.edu.uce.modelo.Telefono;

public interface ITelefonoRepo {
	void insertarTelefono(Telefono p);
	Telefono buscarTelefono(Integer id);
	void actualizarTelefono(Telefono p, Integer i);
	void borrarTelefono(Integer id);
}
