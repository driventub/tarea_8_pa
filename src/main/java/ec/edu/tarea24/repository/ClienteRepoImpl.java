package ec.edu.tarea24.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.tarea24.modelo.Cliente;




@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo {

	private static final Logger LOG = LoggerFactory.getLogger(ClienteRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;

	@Override
	public void insertarCliente(Cliente p) {
		this.e.persist(p);

	}

	@Override
	public Cliente buscarClientePorId(Integer id) {
		return this.e.find(Cliente.class, id);

	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void updateCliente(Cliente p) {
		this.e.merge(p);
		try {
			throw new NullPointerException();	
		}catch(NullPointerException e) {
			LOG.info("Se absorbio la excepcion");
		}
		

	}

	@Override
	public void borrarClientePorId(Integer id) {
		Cliente gBorrar = this.buscarClientePorId(id);
		this.e.remove(gBorrar);

	}
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Cliente buscarClientePorCedula(String cedula) {

		TypedQuery<Cliente> myTypedQuery = (TypedQuery<Cliente>) this.e
				.createQuery("SELECT f FROM Cliente f WHERE f.cedula =:valor ",Cliente.class);
		myTypedQuery.setParameter("valor", cedula);
		
			
			
		return myTypedQuery.getSingleResult();

	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Cliente> buscarListaClientes(Integer id) {
		TypedQuery<Cliente> myTypedQuery = (TypedQuery<Cliente>) this.e
				.createQuery("SELECT f FROM Cliente f WHERE f.membresia =:valor ",Cliente.class);
		myTypedQuery.setParameter("valor", id);
		
			
		List<Cliente> l1 = myTypedQuery.getResultList();
		
	
			
		return l1;
	}
}