package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.FuentePoder;

public interface IFuentePoderService {
	void guardar(FuentePoder g);
	void actualizar(FuentePoder g);
	FuentePoder buscar(Integer i);
	void eliminar(Integer i);
}
