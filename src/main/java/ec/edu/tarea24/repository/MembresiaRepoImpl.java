package ec.edu.tarea24.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.tarea24.modelo.Membresia;

@Repository
@Transactional
public class MembresiaRepoImpl implements IMembresiaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(MembresiaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarMembresia(Membresia p) {
		this.e.persist(p);

	}

	@Override
	public Membresia buscarMembresiaPorId(Integer id) {
		return this.e.find(Membresia.class, id);

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void updateMembresia(Membresia p) {
		this.e.merge(p);
		try {
			throw new NullPointerException();	
		}catch(NullPointerException e) {
			LOG.info("Se absorbio la excepcion");
		}
		

	}

	@Override
	public void borrarMembresiaPorId(Integer id) {
		Membresia gBorrar = this.buscarMembresiaPorId(id);
		this.e.remove(gBorrar);

	}
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Membresia buscarMembresiaPorCodigo(String codigo) {

		TypedQuery<Membresia> myTypedQuery = (TypedQuery<Membresia>) this.e
				.createQuery("SELECT f FROM Membresia f WHERE f.codigo =:valor ",Membresia.class);
		myTypedQuery.setParameter("valor", codigo);
		
			
			
		return myTypedQuery.getSingleResult();

	}

	
}