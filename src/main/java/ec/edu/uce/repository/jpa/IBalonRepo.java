package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Balon;

public interface IBalonRepo {

	void insertarBalon(Balon p);

	Balon buscarBalonPorId(Integer id);

	void actualizarBalonPorId(Balon p);

	void borrarBalonPorId(Integer id);

	Balon buscarBalonPorMarca(String marca);

	Balon buscarBalonPorMarcaTyped(String marca);

	Balon buscarBalonPorMarcaNamed(String marca);

	Balon buscarBalonPorMarcaNative(String marca);

}
