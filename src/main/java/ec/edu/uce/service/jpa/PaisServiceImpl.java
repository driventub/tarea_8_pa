package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Pais;
import ec.edu.uce.repository.jpa.IPaisRepo;

@Service
public class PaisServiceImpl implements IPaisService{

	@Autowired
	private IPaisRepo paisRepo;
	
	@Override
	public void guardar(Pais p) {
		this.paisRepo.insertarPais(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pais buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Pais p) {
		// TODO Auto-generated method stub
		
	}

}
