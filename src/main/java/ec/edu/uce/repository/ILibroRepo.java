package ec.edu.uce.repository;

import ec.edu.uce.modelo.Libro;

public interface ILibroRepo {
	void insertarLibro(Libro p);
	Libro buscarLibro(Integer id);
	void actualizarLibro(Libro p, Integer i);
	void borrarLibro(Integer id);
}
