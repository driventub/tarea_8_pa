package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Esfero;
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
	public GotasOjo buscarGotasOjoPorId(Integer id) {
		return this.e.find(GotasOjo.class,id);
	}

	@Override
	public void actualizarGotasOjoPorId(GotasOjo p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarGotasOjoPorId(Integer id) {
		GotasOjo gBorrar = this.buscarGotasOjoPorId(id);
		this.e.remove(gBorrar);
		
		
	}

	@Override
	public GotasOjo buscarGotasOjoPorVolumen(Integer v) {
		Query miQuery = this.e.createQuery("select g from GotasOjo g where g.volumen=:valor");
		miQuery.setParameter("valor",v);
		GotasOjo miGotasOjo = (GotasOjo) miQuery.getSingleResult();
		return miGotasOjo;
	}

	@Override
	public GotasOjo buscarGotasOjoPorVolumenTyped(Integer v) {
		TypedQuery<GotasOjo> myTypedQuery = (TypedQuery<GotasOjo>) this.e.createQuery("select g from GotasOjo g where g.volumen=:valor");
		myTypedQuery.setParameter("valor",v);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public GotasOjo buscarGotasOjoPorVolumenNamed(Integer v) {
		Query miQuery = this.e.createNamedQuery("GotasOjo.buscarPorVolumen");
		miQuery.setParameter("valor",v);
		
		return (GotasOjo) miQuery.getSingleResult();
	}

	@Override
	public GotasOjo buscarGotasOjoPorVolumenNative(Integer v) {
		Query miQuery = this.e.createNativeQuery("SELECT * FROM gotas_ojo g WHERE g.volumen=:valor", GotasOjo.class);
		miQuery.setParameter("valor",v);
		
		
		return (GotasOjo) miQuery.getSingleResult();
	}
	
	

}
