package ec.edu.tarea24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.tarea24.modelo.FacturaElectronica;
import ec.edu.tarea24.repository.IFacturaElectronicaRepo;

@Service
public class FacturaElectronicaServiceImpl implements IFacturaElectronicaService {

	@Autowired
	private IFacturaElectronicaRepo cuentaBancaria;

	@Override
	public void insertarFacturaElectronica(FacturaElectronica p) {
		this.cuentaBancaria.insertarFacturaElectronica(p);

	}

	@Override
	public FacturaElectronica buscarFacturaElectronicaPorId(Integer id) {
		return this.cuentaBancaria.buscarFacturaElectronicaPorId(id);

	}

	@Override
	public void updateFacturaElectronica(FacturaElectronica p) {
		this.cuentaBancaria.updateFacturaElectronica(p);

	}

	@Override
	public void borrarFacturaElectronicaPorId(Integer id) {
		this.cuentaBancaria.borrarFacturaElectronicaPorId(id);

	}

}
