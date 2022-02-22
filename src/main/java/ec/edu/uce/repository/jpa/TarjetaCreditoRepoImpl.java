package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.TarjetaCredito;

@Repository
@Transactional
public class TarjetaCreditoRepoImpl implements ITarjetaCreditoRepo {
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertar(TarjetaCredito t) {
		this.e.persist(t);
		
		
	}

	@Override
	public void actualizar(TarjetaCredito t) {
		this.e.merge(t);
		
	}

	@Override
	public TarjetaCredito buscar(String numero) {
		TypedQuery<TarjetaCredito> myTypedQuery = (TypedQuery<TarjetaCredito>) this.e.createQuery("select g from TarjetaCredito g where g.numeroTarjeta=:valor");
		myTypedQuery.setParameter("valor",numero);
		
		return myTypedQuery.getSingleResult();
		
	}

}
