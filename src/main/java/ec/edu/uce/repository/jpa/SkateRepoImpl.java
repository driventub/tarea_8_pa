package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Skate;
import ec.edu.uce.modelo.jpa.Esfero;
import ec.edu.uce.modelo.jpa.Skate;

@Repository
@Transactional
public class SkateRepoImpl implements ISkateRepo {

	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarSkate(Skate p) {
		this.e.persist(p);

	}

	@Override
	public Skate buscarSkatePorId(Integer id) {
		return this.e.find(Skate.class, id);

	}

	@Override
	public void actualizarSkatePorId(Skate p) {
		this.e.merge(p);

	}

	@Override
	public void borrarSkatePorId(Integer id) {
		Skate gBorrar = this.buscarSkatePorId(id);
		this.e.remove(gBorrar);

	}

	@Override
	public Skate buscarSkatePorPrecio(BigDecimal b) {
		Query miQuery = this.e.createQuery("select g from Skate g where g.precio<:valor");
		miQuery.setParameter("valor", b);
		Skate miSkate = (Skate) miQuery.getSingleResult();
		return miSkate;

	}

	@Override
	public Skate buscarSkatePorPrecioTyped(BigDecimal b) {
		TypedQuery<Skate> myTypedQuery = (TypedQuery<Skate>) this.e
				.createQuery("select g from Skate g where g.precio<:valor");
		myTypedQuery.setParameter("valor", b);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Skate buscarSkatePorPrecioNamed(BigDecimal b) {
		Query miQuery = this.e.createNamedQuery("Skate.buscarPorPrecio");
		miQuery.setParameter("valor", b);

		return (Skate) miQuery.getSingleResult();

	}

	@Override
	public Skate buscarSkatePorPrecioNative(BigDecimal b) {
		Query miQuery = this.e.createNativeQuery("SELECT * FROM skate g WHERE g.precio<:valor", Skate.class);
		miQuery.setParameter("valor",b);
		
		
		return (Skate) miQuery.getSingleResult();
		
	}

	@Override
	public Skate buscarSkatePorPrecioCriteriaApi(BigDecimal b) {
		CriteriaBuilder myCriteria = this.e.getCriteriaBuilder();

		CriteriaQuery<Skate> myQuery = myCriteria.createQuery(Skate.class);

		Root<Skate> myTable = myQuery.from(Skate.class);

		Predicate p1 = myCriteria.lessThan(myTable.get("precio"), b);
		
		

		myQuery.select(myTable).where(p1);

		TypedQuery<Skate> typedQuery = this.e.createQuery(myQuery);

		return typedQuery.getSingleResult();
	}

}
