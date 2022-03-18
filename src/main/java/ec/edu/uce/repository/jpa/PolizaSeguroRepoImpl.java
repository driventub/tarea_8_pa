package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.PolizaSeguro;
import ec.edu.uce.modelo.jpa.PolizaSeguro;

@Repository
@Transactional
public class PolizaSeguroRepoImpl implements IPolizaSeguroRepo {

	private static final Logger LOG = LoggerFactory.getLogger(PolizaSeguroRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarPolizaSeguro(PolizaSeguro p) {
		this.e.persist(p);

	}

	@Override
	public PolizaSeguro buscarPolizaSeguroPorId(Integer id) {
		return this.e.find(PolizaSeguro.class, id);

	}

	@Override
//	@Transactional(value = TxType.REQUIRES_NEW)
	public void updatePolizaSeguro(PolizaSeguro p) {
		this.e.merge(p);
		try {
			throw new NullPointerException();	
		}catch(NullPointerException e) {
			LOG.info("Se absorbio la excepcion");
		}
		

	}

	@Override
	public void borrarPolizaSeguroPorId(Integer id) {
		PolizaSeguro gBorrar = this.buscarPolizaSeguroPorId(id);
		this.e.remove(gBorrar);

	}

	@Override
	public PolizaSeguro buscarPolizaNumero(String n) {
		TypedQuery<PolizaSeguro> myTypedQuery = (TypedQuery<PolizaSeguro>) this.e
				.createQuery("SELECT f FROM PolizaSeguro f WHERE f.numero =:valor ",PolizaSeguro.class);
		myTypedQuery.setParameter("valor", n);
		return myTypedQuery.getSingleResult();
	}
}	