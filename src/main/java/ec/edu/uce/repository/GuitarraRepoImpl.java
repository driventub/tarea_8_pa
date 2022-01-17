package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Guitarra;

@Repository
public class GuitarraRepoImpl implements IGuitarraRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarGuitarra(Guitarra p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getPrecio(), p.getTipoCuerda(), p.getTipo(), p.getMarca()};
		this.jdbc.update("INSERT INTO guitarra (id,precio,cuerda,tipo,marca) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Guitarra buscarGuitarra(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM guitarra WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Guitarra>(Guitarra.class)) ;
		return null;
	}

	@Override
	public void actualizarGuitarra(Guitarra p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getPrecio(), p.getTipoCuerda(), p.getTipo(), p.getMarca(), i};
		this.jdbc.update("UPDATE guitarra SET id=?, precio=?,cuerda=?,tipo=?, marca=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarGuitarra(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM guitarra WHERE id=?",datoBorrar);
	}


}
