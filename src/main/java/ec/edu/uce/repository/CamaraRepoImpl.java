package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Camara;
import ec.edu.uce.modelo.Camara;

@Repository
public class CamaraRepoImpl implements ICamaraRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarCamara(Camara p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getMegaPixel(), p.getApertura(), p.getMarca(), p.getHdr() };
		this.jdbc.update("INSERT INTO camara (id,mega_pixel,apertura,marca,hdr) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Camara buscarCamara(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM camara WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Camara>(Camara.class)) ;
		return null;
	}

	@Override
	public void actualizarCamara(Camara p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[] { p.getId(), p.getMegaPixel(), p.getApertura(), p.getMarca(), p.getHdr() , i};
		this.jdbc.update("UPDATE camara SET id=?, mega_pixel=?,apertura=?,marca=?, hdr=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarCamara(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM camara WHERE id=?",datoBorrar);
	}

}
