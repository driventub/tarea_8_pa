package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Balon;

public interface IBalonService {
	void guardar(Balon g);

	void actualizar(Balon g);

	Balon buscar(Integer i);

	void eliminar(Integer i);

	Balon buscarMarca(String marca);

	Balon buscarMarcaTyped(String marca);

	Balon buscarMarcaNamed(String marca);

	Balon buscarMarcaNative(String marca);
	Balon buscarMarcaCriteriaAPI(String marca);
}
