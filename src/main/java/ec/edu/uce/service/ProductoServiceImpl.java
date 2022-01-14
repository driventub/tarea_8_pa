package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service 
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepo pacienteRepo;
	
	@Override
	public void insertarProductoNuevo(Producto p) {
		this.pacienteRepo.insertarProducto(p);
		
	}
	
}
