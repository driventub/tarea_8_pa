package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Esfero;
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
	public FuentePoder buscarFuentePoderPorId(Integer id) {
		return this.e.find(FuentePoder.class,id);
		
	}

	@Override
	public void actualizarFuentePoderPorId(FuentePoder p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarFuentePoderPorId(Integer id) {
		FuentePoder gBorrar = this.buscarFuentePoderPorId(id);
		this.e.remove(gBorrar);
		
		
	}

	@Override
	public FuentePoder buscarFuentePoderPorVoltaje(Integer voltaje) {
		Query miQuery = this.e.createQuery("select g from FuentePoder g where g.voltaje<:valor");
		miQuery.setParameter("valor",voltaje);
		FuentePoder miFuentePoder = (FuentePoder) miQuery.getSingleResult();
		return miFuentePoder;
		
	}

	@Override
	public FuentePoder buscarFuentePoderPorVoltajeTyped(Integer voltaje) {
		TypedQuery<FuentePoder> myTypedQuery = (TypedQuery<FuentePoder>) this.e.createQuery("select g from FuentePoder g where g.voltaje<:valor");
		myTypedQuery.setParameter("valor",voltaje);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public FuentePoder buscarFuentePoderPorVoltajeNamed(Integer voltaje) {
		Query miQuery = this.e.createNamedQuery("FuentePoder.buscarPorVoltaje");
		miQuery.setParameter("valor",voltaje);
		
		return (FuentePoder) miQuery.getSingleResult();
	}

	@Override
	public FuentePoder buscarFuentePoderPorVoltajeNative(Integer voltaje) {
		Query miQuery = this.e.createNativeQuery("SELECT * FROM fuente_poder g WHERE g.voltaje<:valor", FuentePoder.class);
		miQuery.setParameter("valor",voltaje);
		
		
		return (FuentePoder) miQuery.getSingleResult();
	}

	
}
