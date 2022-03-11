package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.modelo.jpa.ReporteCuentaHabienteVIP;
import ec.edu.uce.repository.jpa.ICuentaHabienteRepo;

@Service
public class CuentaHabienteServiceImpl implements ICuentaHabienteService {

	@Autowired
	private ICuentaHabienteRepo cuentaHabiente;

	@Override
	public void insertarCuentaHabiente(CuentaHabiente p) {
		this.cuentaHabiente.insertarCuentaHabiente(p);

	}

	@Override
	public CuentaHabiente buscarCuentaHabientePorId(Integer id) {
		return this.cuentaHabiente.buscarCuentaHabientePorId(id);

	}

	@Override
	public void updateCuentaHabiente(CuentaHabiente p) {
		this.cuentaHabiente.updateCuentaHabiente(p);

	}

	@Override
	public void borrarCuentaHabientePorId(Integer id) {
		this.cuentaHabiente.borrarCuentaHabientePorId(id);

	}

	@Override
	public List<ReporteCuentaHabienteVIP> buscarReporteCuentaHabiente() {

		return this.cuentaHabiente.buscarReporteCuentaHabiente();
	}
}
