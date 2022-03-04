package ec.edu.uce.service.jpa;

import ec.edu.uce.modelo.jpa.CuentaHabiente;

public interface ICuentaHabienteService {
	void insertarCuentaHabiente(CuentaHabiente p);
	void borrarCuentaHabientePorId(Integer id);
	CuentaHabiente buscarCuentaHabientePorId(Integer id);
	void updateCuentaHabiente(CuentaHabiente p);
}
