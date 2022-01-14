package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.SkateLlanta;

@Repository
public class SkateLlantaRepoImpl implements ISkateLlantaRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarSkateLlanta(SkateLlanta p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getDiametro(), p.getDureza(), p.getMarca(), p.getColor()};
		this.jdbc.update("INSERT INTO skate_llanta(id,diametro,dureza,marca,color) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public SkateLlanta buscarSkateLlanta(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;

		return null;
	}

	@Override
	public void actualizarSkateLlanta(SkateLlanta p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarSkateLlanta(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
