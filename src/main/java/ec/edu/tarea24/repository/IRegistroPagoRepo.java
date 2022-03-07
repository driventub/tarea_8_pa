package ec.edu.tarea24.repository;

import ec.edu.tarea24.modelo.RegistroPago;

public interface IRegistroPagoRepo {
	void insertarRegistroPago(RegistroPago p);
	void borrarRegistroPagoPorId(Integer id);
	RegistroPago buscarRegistroPagoPorId(Integer id);
	void updateRegistroPago(RegistroPago p);
}
