package ec.edu.tarea24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.tarea24.modelo.Membresia;
import ec.edu.tarea24.repository.IMembresiaRepo;

@Service
public class MembresiaServiceImpl implements IMembresiaService {

	@Autowired
	private IMembresiaRepo cuentaBancaria;

	@Override
	public void insertarMembresia(Membresia p) {
		this.cuentaBancaria.insertarMembresia(p);

	}

	@Override
	public Membresia buscarMembresiaPorId(Integer id) {
		return this.cuentaBancaria.buscarMembresiaPorId(id);

	}

	@Override
	public void updateMembresia(Membresia p) {
		this.cuentaBancaria.updateMembresia(p);

	}

	@Override
	public void borrarMembresiaPorId(Integer id) {
		this.cuentaBancaria.borrarMembresiaPorId(id);

	}

	@Override
	public Membresia buscarMembresiaPorCodigo(String codigo) {
		
		return this.cuentaBancaria.buscarMembresiaPorCodigo(codigo);
	}

}
