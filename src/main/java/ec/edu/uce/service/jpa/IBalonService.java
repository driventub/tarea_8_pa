package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Balon;

public interface IBalonService {
	void guardar(Balon g);
	void actualizar(Balon g);
	Balon buscar(Integer i);
	void eliminar(Integer i);
}
