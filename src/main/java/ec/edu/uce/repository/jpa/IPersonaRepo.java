package ec.edu.uce.repository.jpa;


import java.util.List;

import ec.edu.uce.modelo.jpa.Persona;

public interface IPersonaRepo {
	void insertarPersona(Persona p);

	List<Persona> buscarPorEdadJOIN(Integer edad);

	List<Persona> buscarPorEdadLEFT(Integer edad);

	List<Persona> buscarPorEdadRIGHT(Integer edad);

	List<Persona> buscarPorEdadWHERE(Integer edad);
}
