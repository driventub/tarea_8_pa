package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
	public Esfero buscarEsferoPorId(Integer id) {
		return this.e.find(Esfero.class,id);
		
	}

	@Override
	public void actualizarEsferoPorId(Esfero p) {
		this.e.merge(p);
		
	}

	@Override
	public void borrarEsferoPorId(Integer id) {
		Esfero gBorrar = this.buscarEsferoPorId(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public Esfero buscarEsferoPorColor(String color) {
		Query miQuery = this.e.createQuery("select g from Esfero g where g.color=:valor");
		miQuery.setParameter("valor",color);
		Esfero miEsfero = (Esfero) miQuery.getSingleResult();
		return miEsfero;
		
	}

	@Override
	public Esfero buscarEsferoPorColorTyped(String color) {
		TypedQuery<Esfero> myTypedQuery = (TypedQuery<Esfero>) this.e.createQuery("select g from Esfero g where g.color=:valor");
		myTypedQuery.setParameter("valor",color);
		
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Esfero buscarEsferoPorColorNamed(String color) {
		Query miQuery = this.e.createNamedQuery("Esfero.buscarPorColor");
		miQuery.setParameter("valor",color);
		
		return (Esfero) miQuery.getSingleResult();
	}

}
