package ec.edu.tarea24.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.tarea24.modelo.FacturaElectronica;

@Repository
@Transactional
public class FacturaElectronicaRepoImpl implements IFacturaElectronicaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(FacturaElectronicaRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarFacturaElectronica(FacturaElectronica p) {
		this.e.persist(p);

	}

	@Override
	public FacturaElectronica buscarFacturaElectronicaPorId(Integer id) {
		return this.e.find(FacturaElectronica.class, id);

	}

	@Override
	
	@Transactional(value = TxType.MANDATORY)
	public void updateFacturaElectronica(FacturaElectronica p) {
		this.e.merge(p);
		try {
			throw new NullPointerException();	
		}catch(NullPointerException e) {
			LOG.info("Se absorbio la excepcion");
		}
		

	}

	@Override
	public void borrarFacturaElectronicaPorId(Integer id) {
		FacturaElectronica gBorrar = this.buscarFacturaElectronicaPorId(id);
		this.e.remove(gBorrar);

	}
}