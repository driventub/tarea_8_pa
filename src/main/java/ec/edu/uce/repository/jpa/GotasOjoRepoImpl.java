package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.GotasOjo;

@Repository
@Transactional
public class GotasOjoRepoImpl implements IGotasOjoRepo{
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarGotasOjo(GotasOjo p) {
		this.e.persist(p);
		
	}

	@Override
	public GotasOjo buscarGotasOjo(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarGotasOjoPorId(GotasOjo p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarGotasOjoPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
