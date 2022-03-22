package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteService {
	public Paciente buscar(Integer id);
	public List<Paciente> buscarTodos();
	public void actualizar(Paciente e);
	public void eliminar(Integer id);
	public void insertar(Paciente e);
}
