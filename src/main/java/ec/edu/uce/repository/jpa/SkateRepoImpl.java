package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Skate;


@Repository
@Transactional
public class SkateRepoImpl implements ISkateRepo{

	@PersistenceContext
	private EntityManager e;
	
	@Override
	public void insertarSkate(Skate p) {
		this.e.persist(p);
		
	}

	@Override
	public Skate buscarSkatePorId(Integer id) {
		return this.e.find(Skate.class,id);
		
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
		miQuery.setParameter("valor",b);
		Skate miSkate = (Skate) miQuery.getSingleResult();
		return miSkate;

	}
	
}
