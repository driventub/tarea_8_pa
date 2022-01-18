package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.GotasOjo;
import ec.edu.uce.repository.jpa.IGotasOjoRepo;

@Service
public class GotasOjoServiceImpl implements IGotasOjoService{

	@Autowired
	private IGotasOjoRepo gotas;
	
	@Override
	public void guardar(GotasOjo g) {
		this.gotas.insertarGotasOjo(g);
		
	}

	@Override
	public void actualizar(GotasOjo g) {
		this.gotas.actualizarGotasOjoPorId(g);
		
	}

	@Override
	public GotasOjo buscar(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer i) {
		// TODO Auto-generated method stub
		
	}

}
