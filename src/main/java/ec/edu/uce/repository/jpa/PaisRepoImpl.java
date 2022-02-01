package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Pais;

@Repository
@Transactional
public class PaisRepoImpl implements IPaisRepo{
	
	@PersistenceContext
	
	private EntityManager e;
	
	@Override
	public void insertarPais(Pais p) {
		this.e.persist(p);
		
	}

	@Override
	public void borrarPaisPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pais buscarPaisPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePais(Pais p) {
		// TODO Auto-generated method stub
		
	}

}
