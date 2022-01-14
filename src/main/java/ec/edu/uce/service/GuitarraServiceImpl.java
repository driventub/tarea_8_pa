package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Guitarra;
import ec.edu.uce.repository.IGuitarraRepo;

@Service
public class GuitarraServiceImpl implements IGuitarraService{
	
	@Autowired
	private IGuitarraRepo pacienteRepo;
	
	@Override
	public void insertarGuitarraNuevo(Guitarra p) {
		this.pacienteRepo.insertarGuitarra(p);
		
	}
	
}
