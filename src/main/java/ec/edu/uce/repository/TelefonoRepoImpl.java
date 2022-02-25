package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Telefono;

@Repository
public class TelefonoRepoImpl implements ITelefonoRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarTelefono(Telefono p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getNombre(), p.getMarca(), p.getSistema() ,p.getNfc()};
		this.jdbc.update("INSERT INTO telefono (id,nombre,marca,sistema,nfc) values(?,?,?,?,?) ", datosInsertar);
	}
	
	
	@Override
	public Telefono buscarTelefono(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM telefono WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Telefono>(Telefono.class)) ;
		return null;
	}

	@Override
	public void actualizarTelefono(Telefono p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getNombre(), p.getMarca(), p.getSistema() ,p.getNfc(), i};
		this.jdbc.update("UPDATE telefono SET id=?, nombre=?,marca=?,sistema=?, nfc=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarTelefono(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM telefono WHERE id=?",datoBorrar);
	}

}
