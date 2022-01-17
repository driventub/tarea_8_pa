package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM teclado WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Teclado>(Teclado.class)) ;
		return null;
	}

	@Override
	public void actualizarTeclado(Teclado p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getNumTeclas(), p.getSwitche(), p.getKeycap() , p.getTipo(), p.getLubed(), i};
		this.jdbc.update("UPDATE teclado SET id=?, num_teclas=?,switche=?,keycap=?, tipo=?, lubed=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarTeclado(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM teclado WHERE id=?",datoBorrar);
	}


}
