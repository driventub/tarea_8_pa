package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Balon;

@Repository
@Transactional
public class BalonRepoImpl implements IBalonRepo{
	
	@PersistenceContext
	private EntityManager e;
	
	
	@Override
	public void insertarBalon(Balon p) {
		this.e.persist(p);
		
	}

	@Override
	public Balon buscarBalon(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarBalonPorId(Balon p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarBalonPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
