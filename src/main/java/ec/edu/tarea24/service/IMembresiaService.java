package ec.edu.tarea24.service;

import ec.edu.tarea24.modelo.Membresia;

public interface IMembresiaService {
	void insertarMembresia(Membresia p);
	void borrarMembresiaPorId(Integer id);
	Membresia buscarMembresiaPorId(Integer id);
	Membresia buscarMembresiaPorCodigo(String codigo);
	void updateMembresia(Membresia p);
}
