package ec.edu.uce.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaHabiente;



@Repository
@Transactional
public class CuentaHabienteRepoImpl implements ICuentaHabienteRepo {

	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarCuentaHabiente(CuentaHabiente p) {
		this.e.persist(p);

	}

	@Override
	public CuentaHabiente buscarCuentaHabientePorId(Integer id) {
		return this.e.find(CuentaHabiente.class, id);

	}

	@Override
	public void updateCuentaHabiente(CuentaHabiente p) {
		this.e.merge(p);

	}

	@Override
	public void borrarCuentaHabientePorId(Integer id) {
		CuentaHabiente gBorrar = this.buscarCuentaHabientePorId(id);
		this.e.remove(gBorrar);

	}
}
