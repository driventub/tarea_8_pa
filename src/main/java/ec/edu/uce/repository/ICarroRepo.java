package ec.edu.uce.repository;

import ec.edu.uce.modelo.Carro;

public interface ICarroRepo {
	void insertarCarro(Carro p);
	Carro buscarCarro(Integer id);
	void actualizarCarro(Carro p,Integer i);
	void borrarCarro(Integer id);
}
