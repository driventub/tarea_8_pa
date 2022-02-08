package ec.edu.uce.service.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.Persona;

public interface IPersonaService {
	
	void guardar(Persona p);
	
	List<Persona> buscarJOIN(Integer edad);

	List<Persona> buscarLEFT(Integer edad);

	List<Persona> buscarRIGHT(Integer edad);

	List<Persona> buscarWHERE(Integer edad);
}
