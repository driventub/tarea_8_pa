package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.util.List;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.ReporteCuentaHabienteVIP;

public interface ICuentaHabienteService {
	void insertarCuentaHabiente(CuentaHabiente p);
	void borrarCuentaHabientePorId(Integer id);
	CuentaHabiente buscarCuentaHabientePorId(Integer id);
	void updateCuentaHabiente(CuentaHabiente p);
	List<ReporteCuentaHabienteVIP> buscarReporteCuentaHabiente();
}
