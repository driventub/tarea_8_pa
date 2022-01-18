package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.Esfero;

public interface IEsferoService {
	void guardar(Esfero g);
	void actualizar(Esfero g);
	Esfero buscar(Integer i);
	void eliminar(Integer i);
}
