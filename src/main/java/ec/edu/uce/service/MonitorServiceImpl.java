package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Monitor;
import ec.edu.uce.repository.IMonitorRepo;

@Service
public class MonitorServiceImpl implements IMonitorService{
	
	@Autowired
	private IMonitorRepo pacienteRepo;
	
	@Override
	public void insertarMonitorNuevo(Monitor p) {
		this.pacienteRepo.insertarMonitor(p);
		
	}
	
}
