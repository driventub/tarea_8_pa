package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Telefono;
import ec.edu.uce.repository.ITelefonoRepo;

@Service
public class TelefonoServiceImpl implements ITelefonoService{
	
	@Autowired
	private ITelefonoRepo pacienteRepo;
	
	@Override
	public void insertarTelefonoNuevo(Telefono p) {
		this.pacienteRepo.insertarTelefono(p);
		
	}
	
}
