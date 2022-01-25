package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.FuentePoder;

public interface IFuentePoderRepo {
	void insertarFuentePoder(FuentePoder p);

	FuentePoder buscarFuentePoderPorId(Integer id);

	void actualizarFuentePoderPorId(FuentePoder p);

	void borrarFuentePoderPorId(Integer id);
	
	FuentePoder buscarFuentePoderPorVoltaje(Integer voltaje);
	FuentePoder buscarFuentePoderPorVoltajeTyped(Integer voltaje);
	FuentePoder buscarFuentePoderPorVoltajeNative(Integer voltaje);
	FuentePoder buscarFuentePoderPorVoltajeNamed(Integer voltaje);

}
