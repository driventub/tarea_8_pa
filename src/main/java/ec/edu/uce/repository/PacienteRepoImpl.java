package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Paciente;



@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{
	
	private static final Logger LOG = LoggerFactory.getLogger(PacienteRepoImpl.class); 
	
	@PersistenceContext
	private EntityManager e;
	
	@Override
	public Paciente buscar(Integer id) {
		return this.e.find(Paciente.class, id);
	}

	@Override
	public List<Paciente> buscarTodos() {
		TypedQuery<Paciente> myTypedQuery = (TypedQuery<Paciente>) this.e
				.createQuery("SELECT f FROM Paciente f    ",Paciente.class);
		return myTypedQuery.getResultList();
		
	}

	@Override
	public void actualizar(Paciente e) {
		this.e.merge(e);
		
	}

	@Override
	public void eliminar(Integer id) {
		Paciente gBorrar = this.buscar(id);
		this.e.remove(gBorrar);
		
	}

	@Override
	public void insertar(Paciente e) {
		this.e.persist(e);
		
	}

}
