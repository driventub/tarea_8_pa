package ec.edu.uce.repository.jpa;

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

import ec.edu.uce.modelo.jpa.Balon;
import ec.edu.uce.modelo.jpa.Balon;

@Repository
@Transactional
public class BalonRepoImpl implements IBalonRepo {

	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarBalon(Balon p) {
		this.e.persist(p);

	}

	@Override
	public Balon buscarBalonPorId(Integer id) {
		return this.e.find(Balon.class, id);
	}

	@Override
	public void actualizarBalonPorId(Balon p) {
		this.e.merge(p);

	}

	@Override
	public void borrarBalonPorId(Integer id) {
		Balon gBorrar = this.buscarBalonPorId(id);
		this.e.remove(gBorrar);

	}

	@Override
	public Balon buscarBalonPorMarca(String marca) {
		Query miQuery = this.e.createQuery("select g from Balon g where g.marca=:marca");
		miQuery.setParameter("marca", marca);
		Balon miBalon = (Balon) miQuery.getSingleResult();
		return miBalon;

	}

	@Override
	public Balon buscarBalonPorMarcaTyped(String marca) {
		TypedQuery<Balon> myTypedQuery = (TypedQuery<Balon>) this.e
				.createQuery("select g from Balon g where g.marca=:valor");
		myTypedQuery.setParameter("valor", marca);

		return myTypedQuery.getSingleResult();

	}

	@Override
	public Balon buscarBalonPorMarcaNamed(String marca) {
		Query miQuery = this.e.createNamedQuery("Balon.buscarPorMarca");
		miQuery.setParameter("valor", marca);

		return (Balon) miQuery.getSingleResult();
	}

	@Override
	public Balon buscarBalonPorMarcaNative(String marca) {
		Query m = this.e.createNativeQuery("select * from balon g where g.marca=:valor", Balon.class);
		m.setParameter("valor", marca);

		return (Balon) m.getSingleResult();
	}

	@Override
	public Balon buscarBalonPorMarcaCriteriaApi(String marca) {
		CriteriaBuilder myCriteria = this.e.getCriteriaBuilder();

		CriteriaQuery<Balon> myQuery = myCriteria.createQuery(Balon.class);

		Root<Balon> myTable = myQuery.from(Balon.class);

		Predicate p1 = myCriteria.equal(myTable.get("marca"), marca);
		
		

		myQuery.select(myTable).where(p1);

		TypedQuery<Balon> typedQuery = this.e.createQuery(myQuery);

		return typedQuery.getSingleResult();

	}

}
