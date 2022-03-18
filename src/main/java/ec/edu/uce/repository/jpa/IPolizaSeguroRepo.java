package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.PolizaSeguro;

public interface IPolizaSeguroRepo {
	void insertarPolizaSeguro(PolizaSeguro p);
	void borrarPolizaSeguroPorId(Integer id);
	PolizaSeguro buscarPolizaSeguroPorId(Integer id);
	void updatePolizaSeguro(PolizaSeguro p);
	PolizaSeguro buscarPolizaNumero(String n);

}
