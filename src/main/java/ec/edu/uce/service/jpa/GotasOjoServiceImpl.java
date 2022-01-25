package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.GotasOjo;

import ec.edu.uce.repository.jpa.IGotasOjoRepo;


@Service
public class GotasOjoServiceImpl implements IGotasOjoService{

	@Autowired
	private IGotasOjoRepo b;
	
	@Override
	public void guardar(GotasOjo g) {
		this.b.insertarGotasOjo(g);
		
	}

	@Override
	public void actualizar(GotasOjo g) {
		this.b.actualizarGotasOjoPorId(g);
		
	}

	@Override
	public GotasOjo buscar(Integer i) {
		
		return this.b.buscarGotasOjoPorId(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.b.borrarGotasOjoPorId(i);
		
	}

	@Override
	public GotasOjo buscarVolumen(Integer i) {
		
		return this.b.buscarGotasOjoPorVolumen(i);
	}

	@Override
	public GotasOjo buscarVolumenTyped(Integer i) {
		return this.b.buscarGotasOjoPorVolumenTyped(i);
	}

	@Override
	public GotasOjo buscarVolumenNamed(Integer i) {
		return this.b.buscarGotasOjoPorVolumenNamed(i); 
	}

	@Override
	public GotasOjo buscarVolumenNative(Integer i) {
		return this.b.buscarGotasOjoPorVolumenNative(i); 
	}
	

}
