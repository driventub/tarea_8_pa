package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Skate;
import ec.edu.uce.repository.jpa.ISkateRepo;

@Service
public class SkateServiceImpl implements ISkateService{
	
	@Autowired
	private ISkateRepo skate;
	
	@Override
	public void guardar(Skate g) {
		this.skate.insertarSkate(g);
		
	}

	@Override
	public void actualizar(Skate g) {
		this.skate.actualizarSkatePorId(g);
		
	}

	@Override
	public Skate buscar(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer i) {
		// TODO Auto-generated method stub
		
	}

}
