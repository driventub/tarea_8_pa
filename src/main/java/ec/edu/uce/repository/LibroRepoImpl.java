package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Libro;

@Repository
public class LibroRepoImpl implements ILibroRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarLibro(Libro p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getAnho(), p.getNombre(), p.getEditorial(), p.getAutor() };
		this.jdbc.update("INSERT INTO libro (id,anho,nombre,editorial,autor) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Libro buscarLibro(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;

		return null;
	}

	@Override
	public void actualizarLibro(Libro p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarLibro(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
