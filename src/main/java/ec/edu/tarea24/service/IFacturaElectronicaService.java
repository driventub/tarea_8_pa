package ec.edu.tarea24.service;

import ec.edu.tarea24.modelo.FacturaElectronica;

public interface IFacturaElectronicaService {
	void insertarFacturaElectronica(FacturaElectronica p);
	void borrarFacturaElectronicaPorId(Integer id);
	FacturaElectronica buscarFacturaElectronicaPorId(Integer id);
	void updateFacturaElectronica(FacturaElectronica p);
}
