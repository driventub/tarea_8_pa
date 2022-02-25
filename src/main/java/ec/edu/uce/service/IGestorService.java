package ec.edu.uce.service;

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

public interface IGestorService {
	void registrarNuevaConsulta(Audifono a, Camara b, Carro c, Guitarra d, Libro l, Monitor m, Producto p,SkateLlanta s, Teclado t, Telefono z);
	void buscarNuevaConsulta(Integer i);
	void actualizarNuevaConsulta(Audifono a, Camara b, Carro c, Guitarra d, Libro l, Monitor m, Producto p,SkateLlanta s, Teclado t, Telefono z, Integer i);
	void borrarNuevaConsulta(Integer i);
	
}
