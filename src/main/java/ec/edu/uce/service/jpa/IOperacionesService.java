package ec.edu.uce.service.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public interface IOperacionesService {
	void realizarRetiro(String numCuenta, BigDecimal valorRetiro);
	void calcularSaldoLambda(BigDecimal saldo);
	void calcularReporteLambda(LocalDateTime fechaRetiro, BigDecimal montoRetiro);
	
}
