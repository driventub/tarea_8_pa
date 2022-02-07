package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Persona;

@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo{

	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarPersona(Persona p) {
		this.e.persist(p);
		
	}

}
