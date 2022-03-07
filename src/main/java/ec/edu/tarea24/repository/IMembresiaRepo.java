package ec.edu.tarea24.repository;

import java.util.List;

import ec.edu.tarea24.modelo.Membresia;

public interface IMembresiaRepo {
	void insertarMembresia(Membresia p);
	void borrarMembresiaPorId(Integer id);
	Membresia buscarMembresiaPorId(Integer id);
	Membresia buscarMembresiaPorCodigo(String codigoMembresia);
	void updateMembresia(Membresia p);
	
	
}
