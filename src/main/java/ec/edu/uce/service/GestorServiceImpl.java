package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Audifono;
import ec.edu.uce.modelo.Camara;
import ec.edu.uce.modelo.Carro;
import ec.edu.uce.modelo.Guitarra;
import ec.edu.uce.modelo.Libro;
import ec.edu.uce.modelo.Monitor;
import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.SkateLlanta;
import ec.edu.uce.modelo.Teclado;
import ec.edu.uce.modelo.Telefono;
import ec.edu.uce.repository.IAudifonoRepo;
import ec.edu.uce.repository.ICamaraRepo;
import ec.edu.uce.repository.ICarroRepo;
import ec.edu.uce.repository.IGuitarraRepo;
import ec.edu.uce.repository.ILibroRepo;
import ec.edu.uce.repository.IMonitorRepo;
import ec.edu.uce.repository.IProductoRepo;
import ec.edu.uce.repository.ISkateLlantaRepo;
import ec.edu.uce.repository.ITecladoRepo;
import ec.edu.uce.repository.ITelefonoRepo;

@Service
public class GestorServiceImpl implements IGestorService{
	
	@Autowired
	private IAudifonoRepo audifonoRepo;
	
	@Autowired
	private ICamaraRepo camaraRepo;
	
	@Autowired
	private ICarroRepo carroRepo;
	
	@Autowired
	private IGuitarraRepo guitarraRepo;
	
	@Autowired
	private ILibroRepo libroRepo;
	
	@Autowired
	private IMonitorRepo monitorRepo;
	
	@Autowired
	private IProductoRepo productoRepo;
	
	@Autowired
	private ISkateLlantaRepo skateLlantaRepo;
	
	@Autowired
	private ITecladoRepo tecladoRepo;
	
	@Autowired
	private ITelefonoRepo telefonoRepo;
	
	@Override
	public void registrarNuevaConsulta(Audifono a, Camara b, Carro c, Guitarra d, Libro l, Monitor m, Producto p,
			SkateLlanta s, Teclado t, Telefono z) {
		
		this.audifonoRepo.insertarAudifono(a);
		
		this.camaraRepo.insertarCamara(b);
		
		this.carroRepo.insertarCarro(c);
		
		this.guitarraRepo.insertarGuitarra(d);
		
		this.libroRepo.insertarLibro(l);
		
		this.monitorRepo.insertarMonitor(m);
		
		this.productoRepo.insertarProducto(p);	
	
		this.skateLlantaRepo.insertarSkateLlanta(s);
		
		this.tecladoRepo.insertarTeclado(t);
		
		this.telefonoRepo.insertarTelefono(z);

		
		
	}

	@Override
	public void buscarNuevaConsulta(Integer i) {
		
		this.audifonoRepo.buscarAudifono(i);
		
		this.camaraRepo.buscarCamara(i);
		
		this.carroRepo.buscarCarro(i);
		
		this.guitarraRepo.buscarGuitarra(i);
		
		this.libroRepo.buscarLibro(i);
		
		this.monitorRepo.buscarMonitor(i);
		
		this.productoRepo.buscarProducto(i);	
	
		this.skateLlantaRepo.buscarSkateLlanta(i);
		
		this.tecladoRepo.buscarTeclado(i);
		
		this.telefonoRepo.buscarTelefono(i);
		
	}

	@Override
	public void actualizarNuevaConsulta(Audifono a, Camara b, Carro c, Guitarra d, Libro l, Monitor m, Producto p,
			SkateLlanta s, Teclado t, Telefono z,Integer i) {
		
		this.audifonoRepo.actualizarAudifono( a, i);
		
		this.camaraRepo.actualizarCamara(b, i);
		
		this.carroRepo.actualizarCarro(c, i);
		
		this.guitarraRepo.actualizarGuitarra(d, i);
		
		this.libroRepo.actualizarLibro(l, i);
		
		this.monitorRepo.actualizarMonitor(m, i);
		
		this.productoRepo.actualizarProducto(p, i);	
	
		this.skateLlantaRepo.actualizarSkateLlanta(s, i);
		
		this.tecladoRepo.actualizarTeclado(t,i);
		
		this.telefonoRepo.actualizarTelefono(z, i);
		
	}

	@Override
	public void borrarNuevaConsulta(Integer i) {
		this.audifonoRepo.borrarAudifono(i);
		
		this.camaraRepo.borrarCamara(i);
		
		this.carroRepo.borrarCarro(i);
		
		this.guitarraRepo.borrarGuitarra(i);
		
		this.libroRepo.borrarLibro(i);
		
		this.monitorRepo.borrarMonitor(i);
		
		this.productoRepo.borrarProducto(i);	
	
		this.skateLlantaRepo.borrarSkateLlanta(i);
		
		this.tecladoRepo.borrarTeclado(i);
		
		this.telefonoRepo.borrarTelefono(i);
		
	}
	
}
