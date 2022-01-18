package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.FuentePoder;

public interface IFuentePoderRepo {
	void insertarFuentePoder(FuentePoder p);

	FuentePoder buscarFuentePoder(Integer id);

	void actualizarFuentePoderPorId(FuentePoder p);

	void borrarFuentePoderPorId(Integer id);

}
