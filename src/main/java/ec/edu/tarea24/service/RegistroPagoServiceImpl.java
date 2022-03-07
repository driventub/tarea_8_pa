package ec.edu.tarea24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.tarea24.modelo.RegistroPago;
import ec.edu.tarea24.repository.IRegistroPagoRepo;

@Service
public class RegistroPagoServiceImpl implements IRegistroPagoService {

	@Autowired
	private IRegistroPagoRepo cuentaBancaria;

	@Override
	public void insertarRegistroPago(RegistroPago p) {
		this.cuentaBancaria.insertarRegistroPago(p);

	}

	@Override
	public RegistroPago buscarRegistroPagoPorId(Integer id) {
		return this.cuentaBancaria.buscarRegistroPagoPorId(id);

	}

	@Override
	public void updateRegistroPago(RegistroPago p) {
		this.cuentaBancaria.updateRegistroPago(p);

	}

	@Override
	public void borrarRegistroPagoPorId(Integer id) {
		this.cuentaBancaria.borrarRegistroPagoPorId(id);

	}

}
