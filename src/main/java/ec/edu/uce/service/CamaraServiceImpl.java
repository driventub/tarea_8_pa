package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Camara;
import ec.edu.uce.repository.ICamaraRepo;

@Service
public class CamaraServiceImpl implements ICamaraService{
	
	@Autowired
	private ICamaraRepo pacienteRepo;
	
	@Override
	public void insertarCamaraNuevo(Camara p) {
		this.pacienteRepo.insertarCamara(p);
		
	}
	
}
