package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarPaciente(Paciente p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getNombre(), p.getApellido(), p.getEdad() };
		this.jdbc.update("INSERT INTO paciente (id,nombre,apellido,edad) values(?,?,?,?) ", datosInsertar);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;

		return null;
	}

	@Override
	public void actualizarPaciente(Paciente p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarPaciente(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
