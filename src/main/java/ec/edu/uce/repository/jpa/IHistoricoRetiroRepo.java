package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.HistoricoRetiro;

public interface IHistoricoRetiroRepo {
	void insertarHistoricoRetiro(HistoricoRetiro p);
	void borrarHistoricoRetiroPorId(Integer id);
	HistoricoRetiro buscarHistoricoRetiroPorId(Integer id);
	void updateHistoricoRetiro(HistoricoRetiro p);
}
