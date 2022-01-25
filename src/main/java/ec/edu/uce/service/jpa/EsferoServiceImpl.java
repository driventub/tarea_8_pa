package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Esfero;

import ec.edu.uce.repository.jpa.IEsferoRepo;


@Service
public class EsferoServiceImpl implements IEsferoService {
	
	@Autowired
	private IEsferoRepo b;
	
	@Override
	public void guardar(Esfero g) {
		this.b.insertarEsfero(g);
		
	}

	@Override
	public void actualizar(Esfero g) {
		this.b.actualizarEsferoPorId(g);
		
	}

	@Override
	public Esfero buscar(Integer i) {
		
		return this.b.buscarEsferoPorId(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.b.borrarEsferoPorId(i);
		
	}

	@Override
	public Esfero buscarColor(String color) {
		
		return this.b.buscarEsferoPorColor(color);
	}

	@Override
	public Esfero buscarColorTyped(String color) {
		return this.b.buscarEsferoPorColorTyped(color);
	}

	@Override
	public Esfero buscarColorNamed(String color) {
		return this.b.buscarEsferoPorColorNamed(color);
	}

	@Override
	public Esfero buscarColorNative(String color) {
		return this.b.buscarEsferoPorColorNative(color);
	}
	

}
