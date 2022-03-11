package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.HistoricoRetiro;
import ec.edu.uce.modelo.jpa.ReporteHistoricoRetiro;
import ec.edu.uce.modelo.jpa.ReporteHistoricoRetiro;

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

	@Override
	public List<ReporteHistoricoRetiro> buscarReporteHistorico() {
		TypedQuery<ReporteHistoricoRetiro> myTypedQuery = (TypedQuery<ReporteHistoricoRetiro>) this.e
				
				.createQuery("SELECT NEW  ec.edu.uce.modelo.jpa.ReporteHistoricoRetiro(d.cedula, d.nombre, d.apellido, f.montoRetiro, f.fechaRetiro) FROM HistoricoRetiro f JOIN f.cuentaHabiente d",ReporteHistoricoRetiro.class);
//		myTypedQuery.setParameter("monto", montoRetiro);
//		myTypedQuery.setParameter("fecha", fechaRetiro);
		
		return myTypedQuery.getResultList();
	}
}	