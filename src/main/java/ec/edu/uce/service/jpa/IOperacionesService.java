package ec.edu.uce.service.jpa;

import java.math.BigDecimal;

public interface IOperacionesService {
	void realizarRetiro(String numCuenta, BigDecimal valorRetiro);
}
