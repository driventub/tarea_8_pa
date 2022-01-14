package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Producto;

@Repository
public class ProductoRepoImpl implements IProductoRepo {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public void insertarProducto(Producto p) {
		Object[] datosInsertar = new Object[] { p.getId(), p.getPrecio(), p.getNombre(), p.getTipo(), p.getMarca()};
		this.jdbc.update("INSERT INTO producto (id,precio,nombre,tipo,marca) values(?,?,?,?,?) ", datosInsertar);
	}

	@Override
	public Producto buscarProducto(Integer id) {
		// TSELECT * FROM paciente WHERE id=1;

		return null;
	}

	@Override
	public void actualizarProducto(Producto p) {
		// UPDATE paciente SET id=1, nombre='Paulo1',apellido='Aldaz2',edad =32, where
		// id=1

	}

	@Override
	public void borrarProducto(Integer id) {
		// DELETE FROM paciente WHERE id=1

	}

}
