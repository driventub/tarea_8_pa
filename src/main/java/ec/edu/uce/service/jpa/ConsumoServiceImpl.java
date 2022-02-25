package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Consumo;
import ec.edu.uce.repository.jpa.IConsumoRepo;

@Service
public class ConsumoServiceImpl implements IConsumoService{

	@Autowired
	private IConsumoRepo consumoRepo;
	
	@Override
	public void guardar(Consumo c) {
		this.consumoRepo.insertar(c);
		
	}

}
