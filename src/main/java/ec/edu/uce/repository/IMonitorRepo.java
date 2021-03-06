package ec.edu.uce.repository;

import ec.edu.uce.modelo.Monitor;

public interface IMonitorRepo {
	void insertarMonitor(Monitor p);
	Monitor buscarMonitor(Integer id);
	void actualizarMonitor(Monitor p, Integer i);
	void borrarMonitor(Integer id);
}
