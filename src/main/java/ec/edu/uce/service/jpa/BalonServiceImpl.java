package ec.edu.uce.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Balon;
import ec.edu.uce.repository.jpa.IBalonRepo;

@Service
public class BalonServiceImpl implements IBalonService{

	@Autowired
	private IBalonRepo b;
	
	@Override
	public void guardar(Balon g) {
		this.b.insertarBalon(g);
		
	}

	@Override
	public void actualizar(Balon g) {
		this.b.actualizarBalonPorId(g);
		
	}

	@Override
	public Balon buscar(Integer i) {
		
		return this.b.buscarBalonPorId(i);
	}

	@Override
	public void eliminar(Integer i) {
		this.b.borrarBalonPorId(i);
		
	}

	@Override
	public Balon buscarMarca(String marca) {
		
		return this.b.buscarBalonPorMarca(marca);
	}

	@Override
	public Balon buscarMarcaTyped(String marca) {
		return this.b.buscarBalonPorMarcaTyped(marca);
	}

	@Override
	public Balon buscarMarcaNamed(String marca) {
		return this.b.buscarBalonPorMarcaNamed(marca);
	}

	@Override
	public Balon buscarMarcaNative(String marca) {
		return this.b.buscarBalonPorMarcaNative(marca);
	}

	@Override
	public Balon buscarMarcaCriteriaAPI(String marca) {
		return this.b.buscarBalonPorMarcaCriteriaApi(marca);
	}
	
}
