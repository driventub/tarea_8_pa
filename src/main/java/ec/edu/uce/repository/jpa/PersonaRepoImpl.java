package ec.edu.uce.repository.jpa;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Persona;
import ec.edu.uce.modelo.jpa.Persona;
import ec.edu.uce.modelo.jpa.Persona;

@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarPersona(Persona p) {
		this.e.persist(p);
		
	}

	@Override
	public List<Persona> buscarPorEdadJOIN(Integer edad) {
		TypedQuery<Persona> myTypedQuery = (TypedQuery<Persona>) this.e
				.createQuery("SELECT f FROM Persona f JOIN f.pasaporte d WHERE f.edad <=:edad",Persona.class);
		myTypedQuery.setParameter("edad", edad);
		
		List<Persona> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Persona f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
	}

	@Override
	public List<Persona> buscarPorEdadLEFT(Integer edad) {
		TypedQuery<Persona> myTypedQuery = (TypedQuery<Persona>) this.e
				.createQuery("SELECT f FROM Persona f LEFT JOIN f.pasaporte d WHERE f.edad <=:edad",Persona.class);
		myTypedQuery.setParameter("edad", edad);
		
		List<Persona> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Persona f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
	}

	@Override
	public List<Persona> buscarPorEdadRIGHT(Integer edad) {
		TypedQuery<Persona> myTypedQuery = (TypedQuery<Persona>) this.e
				.createQuery("SELECT f FROM Persona f RIGHT JOIN f.pasaporte d WHERE f.edad <=:edad",Persona.class);
		myTypedQuery.setParameter("edad", edad);
		
		List<Persona> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Persona f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
	}

	@Override
	public List<Persona> buscarPorEdadWHERE(Integer edad) {
		TypedQuery<Persona> myTypedQuery = (TypedQuery<Persona>) this.e
//				El de la cable primaria solo con f
				.createQuery("SELECT f FROM Persona f, Pasaporte d WHERE f = d.persona AND f.edad <=:edad ",Persona.class);
		myTypedQuery.setParameter("edad", edad);
		
		
		
		List<Persona> l1 = myTypedQuery.getResultList();
		
		LOG.info("Longitud " + l1.size());
		for(Persona f : l1) {
			LOG.info(f.toString());
		}
			
			
		return l1;
	}

}
