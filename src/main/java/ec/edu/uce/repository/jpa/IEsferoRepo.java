package ec.edu.uce.repository.jpa;

import ec.edu.uce.modelo.jpa.Esfero;

public interface IEsferoRepo {
	void insertarEsfero(Esfero p);

	Esfero buscarEsferoPorId(Integer id);

	void actualizarEsferoPorId(Esfero p);

	void borrarEsferoPorId(Integer id);

	Esfero buscarEsferoPorColor(String color);
	Esfero buscarEsferoPorColorTyped(String color);
	Esfero buscarEsferoPorColorNamed(String color);
}
