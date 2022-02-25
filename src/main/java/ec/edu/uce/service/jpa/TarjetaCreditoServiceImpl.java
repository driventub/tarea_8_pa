package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.TarjetaCredito;
import ec.edu.uce.repository.jpa.ITarjetaCreditoRepo;

@Service
public class TarjetaCreditoServiceImpl implements ITarjetaCreditoService{

	@Autowired
	private ITarjetaCreditoRepo tarjetaRepo;
	
	@Override
	public void guardar(TarjetaCredito t) {
		this.tarjetaRepo.insertar(t);
		
	}

	@Override
	public void actualizar(TarjetaCredito t) {
		this.tarjetaRepo.actualizar(t);
		
	}

	@Override
	public TarjetaCredito buscar(String numeroTarjeta) {
		
		return this.tarjetaRepo.buscar(numeroTarjeta);
	}

}
