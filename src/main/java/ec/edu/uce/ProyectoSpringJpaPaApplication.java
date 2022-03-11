package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.CuentaBancaria;
import ec.edu.uce.modelo.jpa.CuentaHabiente;
import ec.edu.uce.service.jpa.ICuentaBancariaService;
import ec.edu.uce.service.jpa.ICuentaHabienteService;
import ec.edu.uce.service.jpa.IOperacionesService;

@SpringBootApplication

public class ProyectoSpringJpaPaApplication implements CommandLineRunner {

//	@Autowired
//	private IFuentePoderService fuente;
//
//	@Autowired
//	private IGotasOjoService gotas;
//
//	@Autowired
//	private ISkateService skate;
//
//	@Autowired
//	private IEsferoService esfero;
//
//	@Autowired
//	private IBalonService balon;

//	@Autowired
//	private IPapaService papa;
//	
//	@Autowired
//	private IPaisService pais;
	
//	@Autowired
//	private IPersonaService persona;
//	
//	@Autowired
//	private IProvinciaService provincia;
	
//	Unidad 3
//	@Autowired
//	private ITarjetaCreditoTransaccion transfer;
	
//	@Autowired
//	private ITarjetaCreditoService tarjetaService;
//	
	@Autowired
	private ICuentaBancariaService banc;
	
	@Autowired
	private ICuentaHabienteService habi;
	
	@Autowired
	private IOperacionesService ope;

//	@Autowired
//	private IGestorService gestor;
	
//	@Autowired
//	private IClienteService cliente;
//	
//	@Autowired
//	private IMembresiaService membresia;
	
	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaPaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaPaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * //// Audifono a = new Audifono(); //// a.setId(4); ////
		 * a.setNombre("asdfasdf"); //// a.setApellido("Alimanha"); //// a.setEdad(123);
		 * //// //// this.pacienteService.insertarAudifonoNuevo(a); //// // ////
		 * Conjunto 1 de datos /* Audifono a = new Audifono(); a.setId(1);
		 * a.setTipo("Wireless"); a.setColor("Azul"); a.setMarca("JLab");
		 * a.setRuidoCancel(false);
		 * 
		 * 
		 * 
		 * Camara b = new Camara(); b.setId(1); b.setMegaPixel(16); b.setApertura(10);
		 * b.setMarca("Samsung"); b.setHdr(true);
		 * 
		 * 
		 * 
		 * Carro c = new Carro(); c.setId(1); c.setAnho(2004); c.setPrecio(7000);
		 * c.setModelo("Corolla"); c.setMarca("Toyota");
		 * 
		 * 
		 * 
		 * Guitarra d = new Guitarra(); d.setId(1); d.setPrecio(300);
		 * d.setTipoCuerda("Nylon"); d.setTipo("Acustica"); d.setMarca("Fender");
		 * 
		 * 
		 * 
		 * Libro l = new Libro(); l.setId(1); l.setAnho(1970);
		 * l.setNombre("Metro 2033"); l.setEditorial("Dilipa"); l.setAutor("Dimitri");
		 * 
		 * 
		 * 
		 * Monitor m = new Monitor(); m.setId(1); m.setHercios(144); m.setTamanho(20);
		 * m.setTipo("TN"); m.setResolucion("4K");
		 * 
		 * 
		 * 
		 * Producto p = new Producto(); p.setId(1); p.setPrecio(2);
		 * p.setNombre("Suavizante"); p.setTipo("Limpieza"); p.setMarca("H&S");
		 * 
		 * 
		 * 
		 * SkateLlanta s = new SkateLlanta(); s.setId(1); s.setDiametro(50);
		 * s.setDureza("70a"); s.setMarca("Mini Logo"); s.setColor("Blanco");
		 * 
		 * 
		 * 
		 * Teclado t = new Teclado(); t.setId(1); t.setNumTeclas(84);
		 * t.setSwitche("Zealious V2"); t.setKeycap("ABS"); t.setTipo("Tactil");
		 * t.setLubed(true);
		 * 
		 * 
		 * 
		 * Telefono z = new Telefono(); z.setId(1); z.setNombre("Moto G Play");
		 * z.setMarca("Lenovo"); z.setSistema("Android 11"); z.setNfc(false);
		 * 
		 * 
		 * 
		 * 
		 * // Conjunto 2 de datos Audifono a2 = new Audifono(); a2.setId(2);
		 * a2.setTipo("Wired"); a2.setColor("Negro"); a2.setMarca("Beats");
		 * a2.setRuidoCancel(true);
		 * 
		 * 
		 * 
		 * Camara b2 = new Camara(); b2.setId(2); b2.setMegaPixel(48);
		 * b2.setApertura(1); b2.setMarca("Sony"); b2.setHdr(true);
		 * 
		 * 
		 * 
		 * Carro c2 = new Carro(); c2.setId(2); c2.setAnho(2023); c2.setPrecio(40000);
		 * c2.setModelo("Corolla"); c2.setMarca("Toyota");
		 * 
		 * 
		 * 
		 * Guitarra d2 = new Guitarra(); d2.setId(2); d2.setPrecio(499);
		 * d2.setTipoCuerda("Metal"); d2.setTipo("Electrica"); d2.setMarca("Gibson");
		 * 
		 * 
		 * 
		 * Libro l2 = new Libro(); l2.setId(2); l2.setAnho(2004);
		 * l2.setNombre("The Last Juror"); l2.setEditorial("Pearson");
		 * l2.setAutor("Grisham");
		 * 
		 * 
		 * 
		 * Monitor m2 = new Monitor(); m2.setId(2); m2.setHercios(60);
		 * m2.setTamanho(18); m2.setTipo("IPS"); m2.setResolucion("1080p");
		 * 
		 * 
		 * 
		 * Producto p2 = new Producto(); p2.setId(2); p2.setPrecio(5);
		 * p2.setNombre("Escoba"); p2.setTipo("Limpieza"); p2.setMarca("Bic");
		 * 
		 * 
		 * 
		 * SkateLlanta s2 = new SkateLlanta(); s2.setId(2); s2.setDiametro(56);
		 * s2.setDureza("101a"); s2.setMarca("Splitfire"); s2.setColor("Rojo");
		 * 
		 * 
		 * 
		 * Teclado t2 = new Teclado(); t2.setId(2); t2.setNumTeclas(60);
		 * t2.setSwitche("Tangerine C2"); t2.setKeycap("PBT"); t2.setTipo("Linear");
		 * t2.setLubed(false);
		 * 
		 * 
		 * 
		 * Telefono z2 = new Telefono(); z2.setId(2); z2.setNombre("Poco M3");
		 * z2.setMarca("Xiaomi"); z2.setSistema("Android 11"); z2.setNfc(false);
		 * 
		 * 
		 * 
		 * this.gestor.registrarNuevaConsulta(a,b,c,d,l,m,p,s,t,z);
		 * 
		 * 
		 * 
		 * // Seccion Actualizar Audifono a = new Audifono(); a.setId(1);
		 * a.setTipo("Wireless"); a.setColor("Rojo"); a.setMarca("JLab");
		 * a.setRuidoCancel(false);
		 * 
		 * 
		 * 
		 * Camara b = new Camara(); b.setId(1); b.setMegaPixel(16); b.setApertura(10);
		 * b.setMarca("Panasonic"); b.setHdr(true);
		 * 
		 * 
		 * 
		 * Carro c = new Carro(); c.setId(1); c.setAnho(2004); c.setPrecio(7000);
		 * c.setModelo("Corolla"); c.setMarca("Toyota");
		 * 
		 * 
		 * 
		 * Guitarra d = new Guitarra(); d.setId(1); d.setPrecio(300);
		 * d.setTipoCuerda("Nylon"); d.setTipo("Acustica"); d.setMarca("Fender");
		 * 
		 * 
		 * 
		 * Libro l = new Libro(); l.setId(1); l.setAnho(1970);
		 * l.setNombre("Metro 2033"); l.setEditorial("Dilipa"); l.setAutor("Dimitri");
		 * 
		 * 
		 * 
		 * Monitor m = new Monitor(); m.setId(1); m.setHercios(144); m.setTamanho(20);
		 * m.setTipo("TN"); m.setResolucion("4K");
		 * 
		 * 
		 * 
		 * Producto p = new Producto(); p.setId(1); p.setPrecio(2);
		 * p.setNombre("Suavizante"); p.setTipo("Limpieza"); p.setMarca("H&S");
		 * 
		 * 
		 * 
		 * SkateLlanta s = new SkateLlanta(); s.setId(1); s.setDiametro(50);
		 * s.setDureza("70a"); s.setMarca("Mini Logo"); s.setColor("Blanco");
		 * 
		 * 
		 * 
		 * Teclado t = new Teclado(); t.setId(1); t.setNumTeclas(75);
		 * t.setSwitche("Zealious V1"); t.setKeycap("ABS"); t.setTipo("Tactil");
		 * t.setLubed(true);
		 * 
		 * 
		 * 
		 * Telefono z = new Telefono(); z.setId(1); z.setNombre("Moto E4");
		 * z.setMarca("Lenovo"); z.setSistema("Android 7.1"); z.setNfc(false);
		 * 
		 * 
		 * this.gestor.actualizarNuevaConsulta(a,b,c,d,l,m,p,s,t,z,1);
		 * 
		 * // Seccion buscar, aqui hay problema // this.gestor.buscarNuevaConsulta(1);
		 * 
		 * 
		 * // Seccion borrar // No voy a ejecutarlo, dado que me va a borrar todos los 1
		 * // this.gestor.borrarNuevaConsulta(1);
		 * 
		 */

//		Tarea_10

//		Balon b = new Balon();
//		Esfero e = new Esfero();
//		FuentePoder f = new FuentePoder();
//		GotasOjo g = new GotasOjo();
//		Skate s = new Skate();

//		Insercion		
//		b.setMarca("Nike");
//		b.setTamanho(6);
//		
//		e.setColor("Rojo");
//		e.setTipo("Gruesa");
//		
//		f.setTipo("Semi-Modular");
//		f.setVoltaje(700);
//		
//		g.setConcentracion(5);
//		g.setVolumen(11);
//		
//		s.setPrecio(new BigDecimal("100.3"));
//		s.setMarca("Splitfire");
//		
//
//		
//		this.balon.guardar(b);
//		this.esfero.guardar(e);
//		this.fuente.guardar(f);
//		this.gotas.guardar(g);
//		this.skate.guardar(s);

//		actualizar

//		b.setId(3);
//		b.setMarca("Adidas");
//		b.setTamanho(4);
//		
//		e.setId(3);
//		e.setColor("Azul");
//		e.setTipo("Fina");
//		
//		f.setId(3);
//		f.setTipo("No Modular");
//		f.setVoltaje(30);
//		
//		g.setId(3);
//		g.setConcentracion(4);
//		g.setVolumen(9);
//		
//		s.setId(3);
//		s.setPrecio(new BigDecimal("20.99"));
//		s.setMarca("Walmart");
//		
//		this.balon.actualizar(b);
//		this.esfero.actualizar(e);
//		this.fuente.actualizar(f);
//		this.gotas.actualizar(g);
//		this.skate.actualizar(s);

//		Buscar
//		Balon bBuscar = this.balon.buscar(1);
//		System.out.println(bBuscar);
//		
//		Esfero eBuscar =this.esfero.buscar(2);
//		System.out.println(eBuscar);
//		
//		FuentePoder fBuscar = this.fuente.buscar(1);
//		System.out.println(fBuscar);
//		
//		GotasOjo gBuscar = this.gotas.buscar(2);
//		System.out.println(gBuscar);
//		
//		Skate sBuscar = this.skate.buscar(1);
//		System.out.println(sBuscar);

//		Buscar
//		Balon bBuscarMarca = this.balon.buscarMarca("Adidas");
//		System.out.println(bBuscarMarca);
//		
//		Esfero eBuscarColor =this.esfero.buscarColor("Azul");
//		System.out.println(eBuscarColor);
//		
//		FuentePoder fBuscarVoltaje = this.fuente.buscarVoltaje(100);
//		System.out.println(fBuscarVoltaje);
//		
//		GotasOjo gBuscarVolumen = this.gotas.buscarVolumen(9);
//		System.out.println(gBuscarVolumen);
//		
//		Skate sBuscarPrecio = this.skate.buscarPrecio(new BigDecimal("30"));
//		System.out.println(sBuscarPrecio);

//		Borrar

//		this.balon.eliminar(4);
//		this.esfero.eliminar(5);
//		this.fuente.eliminar(4);
//		this.gotas.eliminar(5);
//		this.skate.eliminar(4);

//		Tarea 11 : Typed & Named Queries

//		Balon bBuscarMarca = this.balon.buscarMarcaNamed("Adidas");
//		System.out.println(bBuscarMarca);
//		
//		Esfero eBuscarColor =this.esfero.buscarColorNamed("Azul");
//		System.out.println(eBuscarColor);
//		
//		FuentePoder fBuscarVoltaje = this.fuente.buscarVoltajeNamed(100);
//		System.out.println(fBuscarVoltaje);
//		
//		GotasOjo gBuscarVolumen = this.gotas.buscarVolumenNamed(9);
//		System.out.println(gBuscarVolumen);
//		
//		Skate sBuscarPrecio = this.skate.buscarPrecioNamed(new BigDecimal("30"));
//		System.out.println(sBuscarPrecio);
//		
//		
//		Balon bBuscarMarcaT = this.balon.buscarMarcaTyped("Adidas");
//		System.out.println(bBuscarMarcaT);
//		
//		Esfero eBuscarColorT =this.esfero.buscarColorTyped("Azul");
//		System.out.println(eBuscarColorT);
//		
//		FuentePoder fBuscarVoltajeT = this.fuente.buscarVoltajeTyped(100);
//		System.out.println(fBuscarVoltajeT);
//		
//		GotasOjo gBuscarVolumenT = this.gotas.buscarVolumenTyped(9);
//		System.out.println(gBuscarVolumenT);

//		Skate sBuscarPrecioT = this.skate.buscarPrecioTyped(new BigDecimal("30"));
//		System.out.println(sBuscarPrecioT);

//		Tarea_13 : Native Query

//		
//		Balon bBuscarMarca = this.balon.buscarMarcaNative("Adidas");
//		LOG.info(bBuscarMarca.toString());
//		
//		Esfero eBuscarColor =this.esfero.buscarColorNative("Azul");
//		LOG.info(eBuscarColor.toString());
//		
//		FuentePoder fBuscarVoltaje = this.fuente.buscarVoltajeNative(100);
//		LOG.info(fBuscarVoltaje.toString());
//		
//		GotasOjo gBuscarVolumen = this.gotas.buscarVolumenNative(9);
//		LOG.info(gBuscarVolumen.toString());
//		
//		Skate sBuscarPrecio = this.skate.buscarPrecioNative(new BigDecimal("30"));
//		LOG.info(sBuscarPrecio.toString());

//		Tarea_14: CriteriaAPI

//		Balon bBuscarMarca = this.balon.buscarMarcaCriteriaAPI("Adidas");
//		LOG.info("(Criteria API) + " + bBuscarMarca.toString());
//
//		Esfero eBuscarColor = this.esfero.buscarColorCriteriaAPI("Azul");
//		LOG.info("(Criteria API) + " +eBuscarColor.toString());
//
//		FuentePoder fBuscarVoltaje = this.fuente.buscarVoltajeCriteraAPI(100);
//
//		LOG.info("(Criteria API) + " + fBuscarVoltaje.toString());
//
//		GotasOjo gBuscarVolumen = this.gotas.buscarVolumenCriteriaAPI(9);
//		LOG.info("(Criteria API) + " + gBuscarVolumen.toString());
//
//		Skate sBuscarPrecio = this.skate.buscarPrecioCriteriaAPI(new BigDecimal("30"));
//		LOG.info("(Criteria API) + " + sBuscarPrecio.toString());

//		Tarea_15: Tablas relacionales
		
//		
//		Pais ingl = new Pais();
//		Pais ec = new Pais();
//		Papa pringles= new Papa();
//		Papa ruffles= new Papa();
//		List<NutricionPapa> nutrPringles = new ArrayList<>();
//		List<NutricionPapa> nutrRuffles = new ArrayList<>();
//		
//		List<Ciudad> ciudadIngl = new ArrayList<>();
//		List<Ciudad> ciudadEc = new ArrayList<>();
//		NutricionPapa n1 = new NutricionPapa();
//		NutricionPapa n2 = new NutricionPapa();
//		NutricionPapa n3 = new NutricionPapa();
//		NutricionPapa n4 = new NutricionPapa();
//	
//		
//		Ciudad c1 = new Ciudad(); 
//		Ciudad c2 = new Ciudad(); 
//		Ciudad c3 = new Ciudad(); 
//		Ciudad c4 = new Ciudad(); 
//		Ciudad c5 = new Ciudad(); 
//		Ciudad c6 = new Ciudad(); 
//
////		Contruccion primer pais
//		ingl.setNombre("Inglaterra");
//		ingl.setPoblacion(5598000);
//		ingl.setTamanho(new BigDecimal("130279.00"));
//		
//		c1.setNombre("Croyton");
//		c2.setNombre("Londres");
//		c3.setNombre("Manchester");
//		c1.setPais(ingl);
//		c2.setPais(ingl);
//		c3.setPais(ingl);
//		
//		
//		ciudadIngl.add(c1);
//		ciudadIngl.add(c2);
//		ciudadIngl.add(c3);
//		
//		ingl.setCiudad(ciudadIngl);
//		
//		this.pais.guardar(ingl);
//		
//
////		Contruccion segundo pais
//		ec.setNombre("Ecuador");
//		ec.setPoblacion(17715822);
//		ec.setTamanho(new BigDecimal("283581.00"));
//		
//		
//		c4.setNombre("Quito");
//		c5.setNombre("Cuenca");
//		c6.setNombre("Loja");
//		c4.setPais(ec);
//		c5.setPais(ec);
//		c6.setPais(ec);
//		
//		
//		
//		ciudadEc.add(c4);
//		ciudadEc.add(c5);
//		ciudadEc.add(c6);
//		
//		ec.setCiudad(ciudadEc);
//		
//		this.pais.guardar(ec);
//		
		
//		Construccion primera papa
		
//		pringles.setMarca("Pringles");
//		pringles.setPrecio(new BigDecimal("3.50"));
//		pringles.setSabor("Cebolla");
//		pringles.setPeso(new BigDecimal("71.00"));
//		
//		
//		n1.setNombre("Grasa Total");
//		n1.setCantidad(new BigDecimal("22.0"));
//		n1.setPorcentaje(28);
//		n2.setNombre("Sodio");
//		n2.setCantidad(new BigDecimal("0.45"));
//		n2.setPorcentaje(18);
//		
//		n1.setPapa(pringles);
//		n2.setPapa(pringles);
//		
//		nutrPringles.add(n1);
//		nutrPringles.add(n2);
//		
//		pringles.setNutricion(nutrPringles);
//		
//		this.papa.guardar(pringles);
//		
////		Construccion segunda papa
//		
//		ruffles.setMarca("Ruffles");
//		ruffles.setPrecio(new BigDecimal("2.75"));
//		ruffles.setSabor("Natural");
//		ruffles.setPeso(new BigDecimal("60.00"));
//		
//		
//		n3.setNombre("Grasa Total");
//		n3.setCantidad(new BigDecimal("20.0"));
//		n3.setPorcentaje(30);
//		n4.setNombre("Sodio");
//		n4.setCantidad(new BigDecimal("0.65"));
//		n4.setPorcentaje(22);
//		
//		n3.setPapa(ruffles);
//		n4.setPapa(ruffles);
//		
//		nutrRuffles.add(n3);
//		nutrRuffles.add(n4);
//		
//		ruffles.setNutricion(nutrRuffles);
//		
//		this.papa.guardar(ruffles);
		
//		Tarea 16: OneToOne
		
//		Provincia pro1 = new Provincia();
//		Persona per1 = new Persona();
//		Provincia pro2 = new Provincia();
//		Persona per2 = new Persona();
//		Capital cap1 = new Capital();
//		Pasaporte pas1 = new Pasaporte();
//		Capital cap2 = new Capital();
//		Pasaporte pas2 = new Pasaporte();
//		
////		Provincia 1
//		
//		pro1.setNombre("Azuay");
//		pro1.setRegion("Sierra");
//		
//		cap1.setNombre("Cuenca");
//		cap1.setPoblacion(334343);
//		cap1.setProvincia(pro1);
//		
//		pro1.setCapital(cap1);
//		
//		this.provincia.guardar(pro1);
//		
////		Provincia 2
//		
//		pro2.setNombre("Pastaza");
//		pro2.setRegion("Oriente");
//		
//		cap2.setNombre("Puyo");
//		cap2.setPoblacion(241562);
//		cap2.setProvincia(pro2);
//		
//		pro2.setCapital(cap2);
//		
//		this.provincia.guardar(pro2);
//		
//		Persona 1
		
//		per1.setNombre("Pepito");
//		per1.setEdad(22);
//		
//		pas1.setNumero("123456789-0");
//		LocalDateTime exp = LocalDateTime.of(2023,Month.AUGUST,8,12,45);
//		pas1.setExpiracion(exp);
//		pas1.setPersona(per1);
//		
//		per1.setPasaporte(pas1);
//		
//		this.persona.guardar(per1);
////		Persona 2
//		
//		per2.setNombre("Anita");
//		per2.setEdad(42);
//		
//		pas2.setNumero("123456783-0");
//		LocalDateTime exp2 = LocalDateTime.of(2026,Month.SEPTEMBER,8,12,45);
//		pas2.setExpiracion(exp2);
//		pas2.setPersona(per2);
//		
//		per2.setPasaporte(pas2);
//		
//		this.persona.guardar(per2);
		

		
//		Cantidad grande para que me imprima todos los datos
//		this.persona.buscarJOIN(1000);
//		this.persona.buscarLEFT(1000);
//		this.persona.buscarRIGHT(1000);
//		this.persona.buscarWHERE(1000);
		
//		Tarea 21
		
//		Creacion Tarjeta Credito
//		TarjetaCredito t = new TarjetaCredito();
//		t.setNumeroTarjeta("1234678983");
//		t.setCedulaPropietario("1367299050-9");
//		t.setCupo(new BigDecimal("5000.00"));
		
//		this.tarjetaService.guardar(t);
		
//		this.transfer.realizarTransaccion(new BigDecimal("33.41"), t.getNumeroTarjeta());

//		Tarea 23
//		Cajero Bancario
		
		
		
		CuentaBancaria b1 = new CuentaBancaria();
		CuentaBancaria b2 = new CuentaBancaria();
		CuentaHabiente h1 = new CuentaHabiente();
		CuentaHabiente h2 = new CuentaHabiente();
		
		h1.setNombre("Wilson");
		h1.setApellido("Garcia");
		h1.setCedula("173478565-0");
		
		h2.setNombre("Lucas");
		h2.setApellido("Sosa");
		h2.setCedula("180987269-1");
		
		b1.setNumCuenta("1234429-3");
		b1.setSaldo(new BigDecimal("2000.00"));
		b1.setTipo("Ahorros");
		b1.setCuentaHabiente(h1);

		b2.setNumCuenta("7893232-1");
		b2.setSaldo(new BigDecimal("4.00"));
		b2.setTipo("Corriente");
		b2.setCuentaHabiente(h2);
		
//		this.habi.insertarCuentaHabiente(h1);
//		this.habi.insertarCuentaHabiente(h2);
//		this.banc.insertarCuentaBancaria(b1);
//		this.banc.insertarCuentaBancaria(b2);
		
//		this.banc.buscarPorCedula(h2.getCedula());
		
//		this.ope.realizarRetiro(b1.getNumCuenta(),new BigDecimal("20.55"));
//		this.ope.realizarRetiro(b1.getNumCuenta(),new BigDecimal("20.55"));
//		this.ope.realizarRetiro(b1.getNumCuenta(),new BigDecimal("20.55"));
//		this.ope.realizarRetiro(b2.getNumCuenta(),new BigDecimal("20.55"));
//		this.ope.realizarRetiro(b2.getNumCuenta(),new BigDecimal("0.01"));
		
//		Tarea 25
		this.ope.calcularSaldoLambda(new BigDecimal(5));
		this.ope.calcularReporteLambda(LocalDateTime.now(),new BigDecimal("2") );

	}

}
