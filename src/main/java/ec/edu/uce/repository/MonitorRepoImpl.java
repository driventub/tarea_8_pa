package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
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

		return null;
	}

	@Override
	public void actualizarMonitor(Monitor p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarMonitor(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
