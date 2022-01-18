package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Esfero;

@Repository
@Transactional
public class EsferoRepoImpl implements IEsferoRepo{

	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarEsfero(Esfero p) {
		this.e.persist(p);
		
	}

	@Override
	public Esfero buscarEsfero(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarEsferoPorId(Esfero p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarEsferoPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
