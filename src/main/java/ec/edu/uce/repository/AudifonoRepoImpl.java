package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Audifono;

@Repository
public class AudifonoRepoImpl implements IAudifonoRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarAudifono(Audifono p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getTipo(), p.getColor(), p.getMarca(), p.getRuidoCancel() };
		this.jdbc.update("INSERT INTO audifono (id,tipo,color,marca,ruido) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Audifono buscarAudifono(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;

		return null;
	}

	@Override
	public void actualizarAudifono(Audifono p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarAudifono(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
