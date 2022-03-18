package ec.edu.uce.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.PolizaSeguro;
import ec.edu.uce.repository.jpa.IPolizaSeguroRepo;

@Service
public class PolizaSeguroServiceImpl implements IPolizaSeguroService {

	@Autowired
	private IPolizaSeguroRepo cuentaBancaria;

	@Override
	public void insertarPolizaSeguro(PolizaSeguro p) {
		this.cuentaBancaria.insertarPolizaSeguro(p);

	}

	@Override
	public PolizaSeguro buscarPolizaSeguroPorId(Integer id) {
		return this.cuentaBancaria.buscarPolizaSeguroPorId(id);

	}

	@Override
	public void updatePolizaSeguro(PolizaSeguro p) {
		this.cuentaBancaria.updatePolizaSeguro(p);

	}

	@Override
	public void borrarPolizaSeguroPorId(Integer id) {
		this.cuentaBancaria.borrarPolizaSeguroPorId(id);

	}

	@Override
	public PolizaSeguro buscarPolizaNumero(String n) {
		return this.cuentaBancaria.buscarPolizaNumero(n);
	}

}
