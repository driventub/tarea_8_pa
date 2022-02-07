package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Provincia;

@Repository
@Transactional
public class ProvinciaRepoImpl implements IProvinciaRepo{
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarProvincia(Provincia p) {
		this.e.persist(p);
		
	}
	
	
}
