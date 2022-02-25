package ec.edu.uce.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Persona;
import ec.edu.uce.repository.jpa.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo personaRepo;
	
	@Override
	public void guardar(Persona p) {
		this.personaRepo.insertarPersona(p);
		
	}

	@Override
	public List<Persona> buscarJOIN(Integer edad) {
		return this.personaRepo.buscarPorEdadJOIN(edad);
	}

	@Override
	public List<Persona> buscarLEFT(Integer edad) {
		return this.personaRepo.buscarPorEdadLEFT(edad);
	}

	@Override
	public List<Persona> buscarRIGHT(Integer edad) {
		return this.personaRepo.buscarPorEdadRIGHT(edad);
	}

	@Override
	public List<Persona> buscarWHERE(Integer edad) {
		return this.personaRepo.buscarPorEdadWHERE(edad);
	}

}
