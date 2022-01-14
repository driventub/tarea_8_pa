package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Teclado;

@Repository
public class TecladoRepoImpl implements ITecladoRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarTeclado(Teclado p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getNumTeclas(), p.getSwitche(), p.getKeycap() , p.getTipo(), p.getLubed()};
		this.jdbc.update("INSERT INTO teclado (id,num_teclas,switche,keycap,tipo,lubed) values(?,?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Teclado buscarTeclado(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;

		return null;
	}

	@Override
	public void actualizarTeclado(Teclado p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarTeclado(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
