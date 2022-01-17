package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Carro;
import ec.edu.uce.modelo.Carro;

@Repository
public class CarroRepoImpl implements ICarroRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarCarro(Carro p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getAnho(), p.getPrecio(), p.getModelo(), p.getMarca() };
		this.jdbc.update("INSERT INTO carro (id,anho,precio,modelo,marca) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Carro buscarCarro(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;
		Object[] datoBuscar = new Object[] {id};
		this.jdbc.queryForObject("SELECT * FROM carro WHERE id=?;",datoBuscar,new BeanPropertyRowMapper<Carro>(Carro.class)) ;
		return null;
	}

	@Override
	public void actualizarCarro(Carro p, Integer i) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where id=1
		Object[] datoActualizar = new Object[]{ p.getId(), p.getAnho(), p.getPrecio(), p.getModelo(), p.getMarca() , i};
		this.jdbc.update("UPDATE carro SET id=?, anho=?,precio=?,modelo=?, marca=? where id=?;",datoActualizar);
	}

	@Override
	public void borrarCarro(Integer id) {
		// DELETE FROM paciente WHERE id=1
		Object[] datoBorrar = new Object[] {id};
		this.jdbc.update("DELETE FROM carro WHERE id=?",datoBorrar);
	}

}
