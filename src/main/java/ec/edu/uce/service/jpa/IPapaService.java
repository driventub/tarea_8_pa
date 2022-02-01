package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Papa;

public interface IPapaService {
	void guardar(Papa p);
	void eliminar(Integer id);
	Papa buscar(Integer id);
	void actualizar(Papa p);
	
}
