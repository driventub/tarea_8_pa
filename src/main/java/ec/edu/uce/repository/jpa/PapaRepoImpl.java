package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Papa;

@Repository
@Transactional
public class PapaRepoImpl implements IPapaRepo{

	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarPapa(Papa p) {
		this.e.persist(p);
		
	}

	@Override
	public void borrarPapaPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Papa buscaPapaPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePapa(Papa p) {
		// TODO Auto-generated method stub
		
	}

}
