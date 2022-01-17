package ec.edu.uce.repository;

import ec.edu.uce.modelo.Camara;

public interface ICamaraRepo {
	void insertarCamara(Camara p);
	Camara buscarCamara(Integer id);
	void actualizarCamara(Camara p, Integer i);
	void borrarCamara(Integer id);
}
