package ec.edu.uce.repository.jpa;

import java.math.BigDecimal;
import java.util.List;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.ReporteCuentaHabienteVIP;

public interface ICuentaHabienteRepo {
	void insertarCuentaHabiente(CuentaHabiente p);
	void borrarCuentaHabientePorId(Integer id);
	CuentaHabiente buscarCuentaHabientePorId(Integer id);
	void updateCuentaHabiente(CuentaHabiente p);
	List<ReporteCuentaHabienteVIP> buscarReporteCuentaHabiente();
}

