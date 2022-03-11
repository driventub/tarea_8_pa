package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.ReporteCuentaHabienteVIP;




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

	@Override
	public List<ReporteCuentaHabienteVIP> buscarReporteCuentaHabiente() {
		TypedQuery<ReporteCuentaHabienteVIP> myTypedQuery = (TypedQuery<ReporteCuentaHabienteVIP>) this.e
		
				.createQuery("SELECT NEW  ec.edu.uce.modelo.jpa.ReporteCuentaHabienteVIP(f.cedula, f.nombre, f.apellido, d.numCuenta , d.tipo, d.saldo ) FROM CuentaHabiente f JOIN f.cuentaBancaria d",ReporteCuentaHabienteVIP.class);
//		myTypedQuery.setParameter("valor", saldo);
		
		return myTypedQuery.getResultList();
	}
}
