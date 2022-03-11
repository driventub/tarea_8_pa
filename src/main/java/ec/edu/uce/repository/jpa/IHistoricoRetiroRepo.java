package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.jpa.HistoricoRetiro;
import ec.edu.uce.modelo.jpa.ReporteHistoricoRetiro;

public interface IHistoricoRetiroRepo {
	void insertarHistoricoRetiro(HistoricoRetiro p);
	void borrarHistoricoRetiroPorId(Integer id);
	HistoricoRetiro buscarHistoricoRetiroPorId(Integer id);
	void updateHistoricoRetiro(HistoricoRetiro p);
	List<ReporteHistoricoRetiro> buscarReporteHistorico();
}
