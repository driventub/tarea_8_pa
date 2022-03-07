package ec.edu.tarea24.repository;

import java.util.List;

import ec.edu.tarea24.modelo.Cliente;

public interface IClienteRepo {

	void insertarCliente(Cliente p);
	void borrarClientePorId(Integer id);
	Cliente buscarClientePorId(Integer id);
	void updateCliente(Cliente p);
	Cliente buscarClientePorCedula(String cedula);
	List<Cliente> buscarListaClientes(Integer id);
}
