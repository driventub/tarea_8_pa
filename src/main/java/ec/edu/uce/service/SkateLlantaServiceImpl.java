package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.SkateLlanta;
import ec.edu.uce.repository.ISkateLlantaRepo;

@Service
public class SkateLlantaServiceImpl implements ISkateLlantaService{
	
	@Autowired
	private ISkateLlantaRepo pacienteRepo;
	
	@Override
	public void insertarSkateLlantaNuevo(SkateLlanta p) {
		this.pacienteRepo.insertarSkateLlanta(p);
		
	}
	
}
