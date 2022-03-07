package ec.edu.tarea24.repository;

import ec.edu.tarea24.modelo.FacturaElectronica;

public interface IFacturaElectronicaRepo {
	void insertarFacturaElectronica(FacturaElectronica p);
	void borrarFacturaElectronicaPorId(Integer id);
	FacturaElectronica buscarFacturaElectronicaPorId(Integer id);
	void updateFacturaElectronica(FacturaElectronica p);
}
