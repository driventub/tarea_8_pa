package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.FuentePoder;

import ec.edu.uce.repository.jpa.IFuentePoderRepo;


@Service
public class FuentePoderServiceImpl implements IFuentePoderService{

	@Autowired
	private IFuentePoderRepo b;
	
	@Override
	public void guardar(FuentePoder g) {
		this.b.insertarFuentePoder(g);
		
	}

	@Override
	public void actualizar(FuentePoder g) {
		this.b.actualizarFuentePoderPorId(g);
		
	}

	@Override
	public FuentePoder buscar(Integer i) {
		
		return this.b.buscarFuentePoderPorId(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.b.borrarFuentePoderPorId(i);
		
	}

	@Override
	public FuentePoder buscarVoltaje(Integer i) {
		
		return this.b.buscarFuentePoderPorVoltaje(i);
	}

	@Override
	public FuentePoder buscarVoltajeTyped(Integer i) {
		return this.b.buscarFuentePoderPorVoltajeTyped(i);
	}

	@Override
	public FuentePoder buscarVoltajeNamed(Integer i) {
		return this.b.buscarFuentePoderPorVoltajeNamed(i);
	}

	@Override
	public FuentePoder buscarVoltajeNative(Integer i) {
		return this.b.buscarFuentePoderPorVoltajeNative(i);
	}
	
}
