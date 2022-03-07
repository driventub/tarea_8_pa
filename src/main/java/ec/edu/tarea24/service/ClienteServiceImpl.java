package ec.edu.tarea24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.tarea24.modelo.Cliente;
import ec.edu.tarea24.repository.IClienteRepo;



@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo cuentaBancaria;

	@Override
	public void insertarCliente(Cliente p) {
		this.cuentaBancaria.insertarCliente(p);

	}

	@Override
	public Cliente buscarClientePorId(Integer id) {
		return this.cuentaBancaria.buscarClientePorId(id);

	}

	@Override
	public void updateCliente(Cliente p) {
		this.cuentaBancaria.updateCliente(p);

	}

	@Override
	public void borrarClientePorId(Integer id) {
		this.cuentaBancaria.borrarClientePorId(id);

	}

	@Override
	public Cliente buscarClientePorCedula(String cedula) {
		
		return this.cuentaBancaria.buscarClientePorCedula(cedula);
	}

	@Override
	public List<Cliente> buscarListaClientes(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancaria.buscarListaClientes(id);
	}

}
