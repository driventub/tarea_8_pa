package ec.edu.uce.repository;

import ec.edu.uce.modelo.Audifono;

public interface IAudifonoRepo {
	void insertarAudifono(Audifono p);
	Audifono buscarAudifono(Integer id);
	void actualizarAudifono(Audifono p,Integer i);
	void borrarAudifono(Integer id);
}
