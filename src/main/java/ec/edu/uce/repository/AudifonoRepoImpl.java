package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Audifono;
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
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM audifono WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Audifono>(Audifono.class)) ;
		return null;
	}

	@Override
	public void actualizarAudifono(Audifono p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getTipo(), p.getColor(), p.getMarca(), p.getRuidoCancel() , i };
		this.jdbc.update("UPDATE audifono SET id=?, tipo=?,color=?,marca=?, ruido=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarAudifono(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM audifono WHERE id=?",datoBorrar);
	}

}
