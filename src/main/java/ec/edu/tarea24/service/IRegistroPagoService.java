package ec.edu.tarea24.service;

import ec.edu.tarea24.modelo.RegistroPago;

public interface IRegistroPagoService {
	void insertarRegistroPago(RegistroPago p);
	void borrarRegistroPagoPorId(Integer id);
	RegistroPago buscarRegistroPagoPorId(Integer id);
	void updateRegistroPago(RegistroPago p);
}
