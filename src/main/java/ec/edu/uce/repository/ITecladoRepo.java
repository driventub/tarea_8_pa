package ec.edu.uce.repository;

import ec.edu.uce.modelo.Teclado;

public interface ITecladoRepo {
	void insertarTeclado(Teclado p);
	Teclado buscarTeclado(Integer id);
	void actualizarTeclado(Teclado p, Integer i);
	void borrarTeclado(Integer id);
}
