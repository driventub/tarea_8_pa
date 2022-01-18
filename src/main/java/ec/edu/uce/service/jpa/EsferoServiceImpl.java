package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Esfero;
import ec.edu.uce.repository.jpa.IEsferoRepo;

@Service
public class EsferoServiceImpl implements IEsferoService {
	
	@Autowired
	private IEsferoRepo e;
	
	@Override
	public void guardar(Esfero g) {
		this.e.insertarEsfero(g);
		
	}

	@Override
	public void actualizar(Esfero g) {
		this.e.actualizarEsferoPorId(g);
		
	}

	@Override
	public Esfero buscar(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer i) {
		// TODO Auto-generated method stub
		
	}

}
