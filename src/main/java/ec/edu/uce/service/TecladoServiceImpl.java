package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Teclado;
import ec.edu.uce.repository.ITecladoRepo;

@Service
public class TecladoServiceImpl implements ITecladoService{
	
	@Autowired
	private ITecladoRepo pacienteRepo;
	
	@Override
	public void insertarTecladoNuevo(Teclado p) {
		this.pacienteRepo.insertarTeclado(p);
		
	}
	
}
