package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteRepo {
	public Paciente buscar(Integer id);
	public List<Paciente> buscarTodos();
	public void actualizar(Paciente e);
	public void eliminar(Integer id);
	public void insertar(Paciente e);
}
