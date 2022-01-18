package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.FuentePoder;
import ec.edu.uce.repository.jpa.IFuentePoderRepo;

@Service
public class FuentePoderServiceImpl implements IFuentePoderService{

	@Autowired
	private IFuentePoderRepo fuente;
	
	@Override
	public void guardar(FuentePoder g) {
		this.fuente.insertarFuentePoder(g);
		
	}

	@Override
	public void actualizar(FuentePoder g) {
		this.fuente.actualizarFuentePoderPorId(g);
		
	}

	@Override
	public FuentePoder buscar(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer i) {
		// TODO Auto-generated method stub
		
	}

}
