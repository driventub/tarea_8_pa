package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Skate;
import ec.edu.uce.repository.jpa.ISkateRepo;

@Service
public class SkateServiceImpl implements ISkateService{
	
	@Autowired
	private ISkateRepo b;
	
	@Override
	public void guardar(Skate g) {
		this.b.insertarSkate(g);
		
	}

	@Override
	public void actualizar(Skate g) {
		this.b.actualizarSkatePorId(g);
		
	}

	@Override
	public Skate buscar(Integer i) {
		
		return this.b.buscarSkatePorId(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.b.borrarSkatePorId(i);
		
	}

	@Override
	public Skate buscarPrecio(BigDecimal precio) {
		
		return this.b.buscarSkatePorPrecio(precio);
	}

	@Override
	public Skate buscarPrecioTyped(BigDecimal precio) {
		return this.b.buscarSkatePorPrecioTyped(precio);
	}

	@Override
	public Skate buscarPrecioNamed(BigDecimal precio) {
		return this.b.buscarSkatePorPrecioNamed(precio);
	}
	

}
