package ec.edu.uce.repository.jpa;

import java.util.List;

import ec.edu.uce.modelo.jpa.CuentaBancaria;

public interface ICuentaBancariaRepo {
	void insertarCuentaBancaria(CuentaBancaria p);
	void borrarCuentaBancariaPorId(Integer id);
	CuentaBancaria buscarCuentaBancariaPorId(Integer id);
	void updateCuentaBancaria(CuentaBancaria p);
	List<CuentaBancaria> buscarPorCedula(String cedula);
	CuentaBancaria buscarPorNumCuenta(String numCuenta);
}
