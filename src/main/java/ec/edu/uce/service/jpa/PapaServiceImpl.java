package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Papa;
import ec.edu.uce.repository.jpa.IPapaRepo;

@Service
public class PapaServiceImpl implements IPapaService{
	
	@Autowired
	private IPapaRepo papaRepo;
	
	@Override
	public void guardar(Papa p) {
		this.papaRepo.insertarPapa(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Papa buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Papa p) {
		// TODO Auto-generated method stub
		
	}
	
}
