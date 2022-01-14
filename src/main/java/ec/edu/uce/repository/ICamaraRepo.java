package ec.edu.uce.repository;

import ec.edu.uce.modelo.Camara;

public interface ICamaraRepo {
	void insertarCamara(Camara p);
	Camara buscarCamara(Integer id);
	void actualizarCamara(Camara p);
	void borrarCamara(Integer id);
}
