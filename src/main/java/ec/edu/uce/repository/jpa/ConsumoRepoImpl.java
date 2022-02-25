package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Consumo;

@Repository
@Transactional
public class ConsumoRepoImpl implements IConsumoRepo{
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertar(Consumo c) {
		this.e.persist(c);
		
	}
	
	

}
