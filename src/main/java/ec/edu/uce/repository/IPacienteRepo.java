package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	void insertarPaciente(Paciente p);
	Paciente buscarPaciente(Integer id);
	void actualizarPaciente(Paciente p);
	void borrarPaciente(Integer id);
}
