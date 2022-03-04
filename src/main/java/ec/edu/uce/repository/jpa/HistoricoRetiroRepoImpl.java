package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.HistoricoRetiro;

@Repository
@Transactional
public class HistoricoRetiroRepoImpl implements IHistoricoRetiroRepo {

	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarHistoricoRetiro(HistoricoRetiro p) {
		this.e.persist(p);

	}

	@Override
	public HistoricoRetiro buscarHistoricoRetiroPorId(Integer id) {
		return this.e.find(HistoricoRetiro.class, id);

	}

	@Override
	public void updateHistoricoRetiro(HistoricoRetiro p) {
		this.e.merge(p);

	}

	@Override
	public void borrarHistoricoRetiroPorId(Integer id) {
		HistoricoRetiro gBorrar = this.buscarHistoricoRetiroPorId(id);
		this.e.remove(gBorrar);

	}
}	