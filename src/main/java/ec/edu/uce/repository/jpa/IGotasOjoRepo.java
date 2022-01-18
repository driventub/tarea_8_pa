package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.GotasOjo;

public interface IGotasOjoRepo {
	void insertarGotasOjo(GotasOjo p);

	GotasOjo buscarGotasOjo(Integer id);

	void actualizarGotasOjoPorId(GotasOjo p);

	void borrarGotasOjoPorId(Integer id);

}
