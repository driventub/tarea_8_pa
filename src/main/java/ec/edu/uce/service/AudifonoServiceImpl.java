package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Audifono;
import ec.edu.uce.repository.IAudifonoRepo;

@Service
public class AudifonoServiceImpl implements IAudifonoService{
	
	@Autowired
	private IAudifonoRepo pacienteRepo;
	
	@Override
	public void insertarAudifonoNuevo(Audifono p) {
		this.pacienteRepo.insertarAudifono(p);	
	}
}
