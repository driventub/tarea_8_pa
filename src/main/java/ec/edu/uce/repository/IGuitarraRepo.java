package ec.edu.uce.repository;

import ec.edu.uce.modelo.Guitarra;

public interface IGuitarraRepo {
	void insertarGuitarra(Guitarra p);
	Guitarra buscarGuitarra(Integer id);
	void actualizarGuitarra(Guitarra p, Integer i);
	void borrarGuitarra(Integer id);
}
