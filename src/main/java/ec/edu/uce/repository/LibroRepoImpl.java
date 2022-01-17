package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM libro WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Libro>(Libro.class)) ;
		return null;
	}

	@Override
	public void actualizarLibro(Libro p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getAnho(), p.getNombre(), p.getEditorial(), p.getAutor(), i };
		this.jdbc.update("UPDATE libro SET id=?, anho=?,nombre=?,editorial=?, autor=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarLibro(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM libro WHERE id=?",datoBorrar);
	}


}
