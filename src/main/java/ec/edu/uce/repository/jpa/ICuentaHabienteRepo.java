package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.CuentaHabiente;

public interface ICuentaHabienteRepo {
	void insertarCuentaHabiente(CuentaHabiente p);
	void borrarCuentaHabientePorId(Integer id);
	CuentaHabiente buscarCuentaHabientePorId(Integer id);
	void updateCuentaHabiente(CuentaHabiente p);
}
