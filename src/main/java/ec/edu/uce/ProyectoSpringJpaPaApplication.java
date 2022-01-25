package ec.edu.uce;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Balon;
import ec.edu.uce.modelo.jpa.Esfero;
import ec.edu.uce.modelo.jpa.FuentePoder;
import ec.edu.uce.modelo.jpa.GotasOjo;
import ec.edu.uce.modelo.jpa.Skate;
import ec.edu.uce.service.jpa.IBalonService;
import ec.edu.uce.service.jpa.IEsferoService;
import ec.edu.uce.service.jpa.IFuentePoderService;
import ec.edu.uce.service.jpa.IGotasOjoService;
import ec.edu.uce.service.jpa.ISkateService;



@SpringBootApplication

public class ProyectoSpringJpaPaApplication implements CommandLineRunner{

	@Autowired
	private IFuentePoderService fuente;
	
	@Autowired
	private IGotasOjoService gotas;
	
	@Autowired
	private ISkateService skate;
	
	@Autowired
	private IEsferoService esfero;
	
	@Autowired
	private IBalonService balon;
	
	private static final Logger LOG= LoggerFactory.getLogger(ProyectoSpringJpaPaApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaPaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	/*	
////		Audifono a = new Audifono();
////		a.setId(4);
////		a.setNombre("asdfasdf");
////		a.setApellido("Alimanha");
////		a.setEdad(123);
////		
////		this.pacienteService.insertarAudifonoNuevo(a);
////	
//		
////		Conjunto 1 de datos
		/*
		Audifono a = new Audifono();
		a.setId(1);
		a.setTipo("Wireless");
		a.setColor("Azul");
		a.setMarca("JLab");
		a.setRuidoCancel(false);
		
		
		
		Camara b = new Camara();
		b.setId(1);
		b.setMegaPixel(16);
		b.setApertura(10);
		b.setMarca("Samsung");
		b.setHdr(true);
		
		
		
		Carro c = new Carro();
		c.setId(1);
		c.setAnho(2004);
		c.setPrecio(7000);
		c.setModelo("Corolla");
		c.setMarca("Toyota");
		
		
		
		Guitarra d = new Guitarra();
		d.setId(1);
		d.setPrecio(300);
		d.setTipoCuerda("Nylon");
		d.setTipo("Acustica");
		d.setMarca("Fender");
		
		
		
		Libro l = new Libro();
		l.setId(1);
		l.setAnho(1970);
		l.setNombre("Metro 2033");
		l.setEditorial("Dilipa");
		l.setAutor("Dimitri");
		
		
		
		Monitor m = new Monitor();
		m.setId(1);
		m.setHercios(144);
		m.setTamanho(20);
		m.setTipo("TN");
		m.setResolucion("4K");
		
		
		
		Producto p = new Producto();
		p.setId(1);
		p.setPrecio(2);
		p.setNombre("Suavizante");
		p.setTipo("Limpieza");
		p.setMarca("H&S");
		
			
	
		SkateLlanta s = new SkateLlanta();
		s.setId(1);
		s.setDiametro(50);
		s.setDureza("70a");
		s.setMarca("Mini Logo");
		s.setColor("Blanco");
		
		
		
		Teclado t = new Teclado();
		t.setId(1);
		t.setNumTeclas(84);
		t.setSwitche("Zealious V2");
		t.setKeycap("ABS");
		t.setTipo("Tactil");
		t.setLubed(true);
		
		
		
		Telefono z = new Telefono();
		z.setId(1);
		z.setNombre("Moto G Play");
		z.setMarca("Lenovo");
		z.setSistema("Android 11");
		z.setNfc(false);
		
		

		
//		Conjunto 2 de datos
		Audifono a2 = new Audifono();
		a2.setId(2);
		a2.setTipo("Wired");
		a2.setColor("Negro");
		a2.setMarca("Beats");
		a2.setRuidoCancel(true);
		
		
		
		Camara b2 = new Camara();
		b2.setId(2);
		b2.setMegaPixel(48);
		b2.setApertura(1);
		b2.setMarca("Sony");
		b2.setHdr(true);
		
		
		
		Carro c2 = new Carro();
		c2.setId(2);
		c2.setAnho(2023);
		c2.setPrecio(40000);
		c2.setModelo("Corolla");
		c2.setMarca("Toyota");
		
		
		
		Guitarra d2 = new Guitarra();
		d2.setId(2);
		d2.setPrecio(499);
		d2.setTipoCuerda("Metal");
		d2.setTipo("Electrica");
		d2.setMarca("Gibson");
		
		
		
		Libro l2 = new Libro();
		l2.setId(2);
		l2.setAnho(2004);
		l2.setNombre("The Last Juror");
		l2.setEditorial("Pearson");
		l2.setAutor("Grisham");
		
		
		
		Monitor m2 = new Monitor();
		m2.setId(2);
		m2.setHercios(60);
		m2.setTamanho(18);
		m2.setTipo("IPS");
		m2.setResolucion("1080p");
		
		
		
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setPrecio(5);
		p2.setNombre("Escoba");
		p2.setTipo("Limpieza");
		p2.setMarca("Bic");
		
			
	
		SkateLlanta s2 = new SkateLlanta();
		s2.setId(2);
		s2.setDiametro(56);
		s2.setDureza("101a");
		s2.setMarca("Splitfire");
		s2.setColor("Rojo");
		
		
		
		Teclado t2 = new Teclado();
		t2.setId(2);
		t2.setNumTeclas(60);
		t2.setSwitche("Tangerine C2");
		t2.setKeycap("PBT");
		t2.setTipo("Linear");
		t2.setLubed(false);
		
		
		
		Telefono z2 = new Telefono();
		z2.setId(2);
		z2.setNombre("Poco M3");
		z2.setMarca("Xiaomi");
		z2.setSistema("Android 11");
		z2.setNfc(false);
		
		
		
		this.gestor.registrarNuevaConsulta(a,b,c,d,l,m,p,s,t,z);
		
		
		
//		Seccion Actualizar	
		Audifono a = new Audifono();
		a.setId(1);
		a.setTipo("Wireless");
		a.setColor("Rojo");
		a.setMarca("JLab");
		a.setRuidoCancel(false);
		
		
		
		Camara b = new Camara();
		b.setId(1);
		b.setMegaPixel(16);
		b.setApertura(10);
		b.setMarca("Panasonic");
		b.setHdr(true);
		
		
		
		Carro c = new Carro();
		c.setId(1);
		c.setAnho(2004);
		c.setPrecio(7000);
		c.setModelo("Corolla");
		c.setMarca("Toyota");
		
		
		
		Guitarra d = new Guitarra();
		d.setId(1);
		d.setPrecio(300);
		d.setTipoCuerda("Nylon");
		d.setTipo("Acustica");
		d.setMarca("Fender");
		
		
		
		Libro l = new Libro();
		l.setId(1);
		l.setAnho(1970);
		l.setNombre("Metro 2033");
		l.setEditorial("Dilipa");
		l.setAutor("Dimitri");
		
		
		
		Monitor m = new Monitor();
		m.setId(1);
		m.setHercios(144);
		m.setTamanho(20);
		m.setTipo("TN");
		m.setResolucion("4K");
		
		
		
		Producto p = new Producto();
		p.setId(1);
		p.setPrecio(2);
		p.setNombre("Suavizante");
		p.setTipo("Limpieza");
		p.setMarca("H&S");
		
			
	
		SkateLlanta s = new SkateLlanta();
		s.setId(1);
		s.setDiametro(50);
		s.setDureza("70a");
		s.setMarca("Mini Logo");
		s.setColor("Blanco");
		
		
		
		Teclado t = new Teclado();
		t.setId(1);
		t.setNumTeclas(75);
		t.setSwitche("Zealious V1");
		t.setKeycap("ABS");
		t.setTipo("Tactil");
		t.setLubed(true);
		
		
		
		Telefono z = new Telefono();
		z.setId(1);
		z.setNombre("Moto E4");
		z.setMarca("Lenovo");
		z.setSistema("Android 7.1");
		z.setNfc(false);
		
		
		this.gestor.actualizarNuevaConsulta(a,b,c,d,l,m,p,s,t,z,1);
		
//		Seccion buscar, aqui hay problema
//		this.gestor.buscarNuevaConsulta(1);
		
		
//		Seccion borrar
//		No voy a ejecutarlo, dado que me va a borrar todos los 1
//		this.gestor.borrarNuevaConsulta(1);
		
		*/
		
//		Tarea_10
		
		Balon b = new Balon();
		Esfero e = new Esfero();
		FuentePoder f = new FuentePoder();
		GotasOjo g = new GotasOjo();
		Skate s = new Skate();
		
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
		
		Skate sBuscarPrecioT = this.skate.buscarPrecioTyped(new BigDecimal("30"));
		System.out.println(sBuscarPrecioT);
		
//		Tarea_12 : Native Query
		
		
		Balon bBuscarMarca = this.balon.buscarMarcaNative("Adidas");
		LOG.info(bBuscarMarca.toString());
		
		Esfero eBuscarColor =this.esfero.buscarColorNative("Azul");
		LOG.info(eBuscarColor.toString());
		
		FuentePoder fBuscarVoltaje = this.fuente.buscarVoltajeNative(100);
		LOG.info(fBuscarVoltaje.toString());
		
		GotasOjo gBuscarVolumen = this.gotas.buscarVolumenNative(9);
		LOG.info(gBuscarVolumen.toString());
		
		Skate sBuscarPrecio = this.skate.buscarPrecioNative(new BigDecimal("30"));
		LOG.info(sBuscarPrecio.toString());

	}

}
