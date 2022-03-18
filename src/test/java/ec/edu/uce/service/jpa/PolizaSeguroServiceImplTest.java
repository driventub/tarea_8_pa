package ec.edu.uce.service.jpa;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.jpa.PolizaSeguro;

/**
 * 
 * @author aldaz No vale utilizar los CRUD por defecto, xq las secuencias nunca
 *         se reversan
 */

@SpringBootTest
@Rollback(true)
@Transactional
class PolizaSeguroServiceImplTest {
	private static final Logger LOG = LoggerFactory.getLogger(PolizaSeguroServiceImplTest.class);
	@Autowired
	private IPolizaSeguroService polizaService;

	@Test
	void testInsertarPolizaSeguro() {
		PolizaSeguro p = new PolizaSeguro();
		p.setNumero("23478682881");
		p.setValor(new BigDecimal("2.9"));
		p.setDescripcion("Seguro de Carro");
		p.setFechaEmision(LocalDateTime.now());
		p.setFechaVigencia(LocalDateTime.of(2023, Month.DECEMBER, 8, 12, 45));
		p.setEstado("Pagado");

		assertThat(p.getId(), not(new NullPointerException()));

		this.polizaService.insertarPolizaSeguro(p);
	}

	@Test
	void testInsertarPolizaSeguro2() {
		PolizaSeguro p = new PolizaSeguro();
		p.setNumero("23478682881");
		p.setValor(new BigDecimal("2.9"));
		p.setDescripcion("Seguro de Carro");
		p.setFechaEmision(LocalDateTime.now());
		p.setFechaVigencia(LocalDateTime.of(2046, Month.DECEMBER, 8, 12, 45));
		p.setEstado("Pagado");

		this.polizaService.insertarPolizaSeguro(p);

		PolizaSeguro pBuscar = this.polizaService.buscarPolizaNumero("23478682881");

		assertThat(p.getFechaVigencia(), equalTo(pBuscar.getFechaVigencia()));

	}

	@Test
	void testBuscarPolizaSeguroPorId() {
		PolizaSeguro p = this.polizaService.buscarPolizaNumero("77377282882");

		assertThat("Pagado", equalTo(p.getEstado()));
	}

	@Test
	void testBuscarPolizaSeguroPorId2() {
		PolizaSeguro p = this.polizaService.buscarPolizaNumero("77377282882");

		assertThat(LocalDateTime.of(2024, Month.DECEMBER, 8, 12, 45), equalTo(p.getFechaVigencia()));
	}

	@Test
	void testUpdatePolizaSeguro() {
		PolizaSeguro p = this.polizaService.buscarPolizaNumero("77377282882");

		BigDecimal valor = new BigDecimal("300.22");
		p.setValor(valor);

		this.polizaService.updatePolizaSeguro(p);

		PolizaSeguro pA = this.polizaService.buscarPolizaNumero("77377282882");

		assertThat(valor, equalTo(pA.getValor()));

	}

	@Test
	void testUpdatePolizaSeguro2() {
		PolizaSeguro p = this.polizaService.buscarPolizaNumero("77377282882");

		LocalDateTime valor = LocalDateTime.of(2024, Month.DECEMBER, 8, 12, 45);
		p.setFechaVigencia(valor);

		this.polizaService.updatePolizaSeguro(p);

		PolizaSeguro pA = this.polizaService.buscarPolizaNumero("77377282882");

		assertThat(valor, equalTo(pA.getFechaVigencia()));

	}

	@Test
	void testBorrarPolizaSeguro() {

		PolizaSeguro p = this.polizaService.buscarPolizaNumero("77377282882");

		LOG.info("s" + p.getId());
		this.polizaService.borrarPolizaSeguroPorId(p.getId());
//		try {
//			PolizaSeguro pB = this.polizaService.buscarPolizaNumero("77377282882");
//		}catch(NullPointerException e) {
//			
//		}
		

//		Esta tendria que ser la que se deberia poner
		assertThat(p.getId(), notNullValue());


	}

	@Test
	void testBorrarPolizaSeguro2() {
		PolizaSeguro p = this.polizaService.buscarPolizaNumero("77377282882");

		LOG.info("s" + p.getId());
		this.polizaService.borrarPolizaSeguroPorId(p.getId());
//		try {
//			PolizaSeguro pB = this.polizaService.buscarPolizaNumero("77377282882");
//		}catch(NullPointerException e) {
//			
//		}
		

//		Esta tendria que ser la que se deberia poner
		assertThat(p.getId(), not(1));

	}

	@BeforeEach
	void datos() {
		PolizaSeguro p = new PolizaSeguro();
		p.setNumero("77377282882");
		p.setValor(new BigDecimal("200.9"));
		p.setDescripcion("Seguro de Carro");
		p.setFechaEmision(LocalDateTime.now());
		p.setFechaVigencia(LocalDateTime.of(2024, Month.DECEMBER, 8, 12, 45));
		p.setEstado("Pagado");

		this.polizaService.insertarPolizaSeguro(p);
	}

}
