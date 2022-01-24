package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.GotasOjo;

public interface IGotasOjoService {
	void guardar(GotasOjo g);
	void actualizar(GotasOjo g);
	GotasOjo buscar(Integer i);
	void eliminar(Integer i);
	GotasOjo buscarVolumen(Integer i);
	GotasOjo buscarVolumenTyped(Integer i);
	GotasOjo buscarVolumenNamed(Integer i);
}
