package ec.edu.tarea24.service;

import java.util.List;

import ec.edu.tarea24.modelo.Cliente;

public interface IClienteService {

	void insertarCliente(Cliente p);

	void borrarClientePorId(Integer id);

	Cliente buscarClientePorId(Integer id);

	Cliente buscarClientePorCedula(String cedula);

	void updateCliente(Cliente p);

	List<Cliente> buscarListaClientes(Integer id);
}
