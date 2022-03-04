package ec.edu.uce.service.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaService {
	void insertarCuentaBancaria(CuentaBancaria p);
	void borrarCuentaBancariaPorId(Integer id);
	CuentaBancaria buscarCuentaBancariaPorId(Integer id);
	void updateCuentaBancaria(CuentaBancaria p);
	List<CuentaBancaria> buscarPorCedula(String cedula);
	CuentaBancaria buscarPorNumCuenta(String numCuenta);
}
