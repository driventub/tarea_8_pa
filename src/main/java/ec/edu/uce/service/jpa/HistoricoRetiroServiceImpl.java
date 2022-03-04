package ec.edu.uce.service.jpa;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.HistoricoRetiro;
import ec.edu.uce.repository.jpa.IHistoricoRetiroRepo;

@Service
public class HistoricoRetiroServiceImpl implements IHistoricoRetiroService {

	@Autowired
	private IHistoricoRetiroRepo cuentaBancaria;

	@Override
	public void insertarHistoricoRetiro(HistoricoRetiro p) {
		this.cuentaBancaria.insertarHistoricoRetiro(p);

	}

	@Override
	public HistoricoRetiro buscarHistoricoRetiroPorId(Integer id) {
		return this.cuentaBancaria.buscarHistoricoRetiroPorId(id);

	}

	@Override
	public void updateHistoricoRetiro(HistoricoRetiro p) {
		this.cuentaBancaria.updateHistoricoRetiro(p);

	}

	@Override
	public void borrarHistoricoRetiroPorId(Integer id) {
		this.cuentaBancaria.borrarHistoricoRetiroPorId(id);

	}
}
