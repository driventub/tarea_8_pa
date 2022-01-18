package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.FuentePoder;

@Repository
@Transactional
public class FuentePoderRepoImpl implements IFuentePoderRepo{
	
	@PersistenceContext
	private EntityManager e;
	@Override
	public void insertarFuentePoder(FuentePoder p) {
		this.e.persist(p);
		
	}

	@Override
	public FuentePoder buscarFuentePoder(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarFuentePoderPorId(FuentePoder p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarFuentePoderPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
