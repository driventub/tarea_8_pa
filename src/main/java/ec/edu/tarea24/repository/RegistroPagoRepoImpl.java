package ec.edu.tarea24.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.tarea24.modelo.RegistroPago;



@Repository
@Transactional
public class RegistroPagoRepoImpl implements IRegistroPagoRepo {

	private static final Logger LOG = LoggerFactory.getLogger(RegistroPagoRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarRegistroPago(RegistroPago p) {
		this.e.persist(p);

	}

	@Override
	public RegistroPago buscarRegistroPagoPorId(Integer id) {
		return this.e.find(RegistroPago.class, id);

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void updateRegistroPago(RegistroPago p) {
		this.e.merge(p);
		try {
			throw new NullPointerException();	
		}catch(NullPointerException e) {
			LOG.info("Se absorbio la excepcion");
		}
		

	}

	@Override
	public void borrarRegistroPagoPorId(Integer id) {
		RegistroPago gBorrar = this.buscarRegistroPagoPorId(id);
		this.e.remove(gBorrar);

	}
}