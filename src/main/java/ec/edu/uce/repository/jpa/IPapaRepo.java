package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Papa;
// Pongo con todo los metodos CRUD, probablemente van  a ser necesarios despues
public interface IPapaRepo {
	void insertarPapa(Papa p);
	void borrarPapaPorId(Integer id);
	Papa buscaPapaPorId(Integer id);
	void updatePapa(Papa p);
	
}
