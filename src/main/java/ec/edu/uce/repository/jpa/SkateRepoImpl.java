package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Skate;

@Repository
@Transactional
public class SkateRepoImpl implements ISkateRepo{

	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarSkate(Skate p) {
		this.e.persist(p);
		
	}

	@Override
	public Skate buscarSkate(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarSkatePorId(Skate p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarSkatePorId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
