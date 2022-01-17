package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Monitor;

@Repository
public class MonitorRepoImpl implements IMonitorRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarMonitor(Monitor p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getHercios(), p.getTamanho(), p.getTipo(),p.getResolucion() };
		this.jdbc.update("INSERT INTO monitor (id,hercios,tamanho,tipo,resolucion) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Monitor buscarMonitor(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM monitor WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Monitor>(Monitor.class)) ;
		return null;
	}

	@Override
	public void actualizarMonitor(Monitor p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getHercios(), p.getTamanho(), p.getTipo(),p.getResolucion() , i };
		this.jdbc.update("UPDATE monitor SET id=?, hercios=?,tamanho=?,tipo=?, resolucion=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarMonitor(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM monitor WHERE id=?",datoBorrar);
	}


}
