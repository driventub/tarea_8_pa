package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.HistoricoRetiro;

public interface IHistoricoRetiroService {
	void insertarHistoricoRetiro(HistoricoRetiro p);
	void borrarHistoricoRetiroPorId(Integer id);
	HistoricoRetiro buscarHistoricoRetiroPorId(Integer id);
	void updateHistoricoRetiro(HistoricoRetiro p);
}
