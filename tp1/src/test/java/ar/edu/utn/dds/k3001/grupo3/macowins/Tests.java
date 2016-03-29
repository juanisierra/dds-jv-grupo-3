package ar.edu.utn.dds.k3001.grupo3.macowins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests 
{	private Negocio macowins;
	private Camisa unaCamisa;
	private Pantalon unPantalon;
	private Saco unSaco;
	private Venta unaVenta;
	private Fecha fechaDeHoy;
	
	@Before
	public void init(){
		macowins = new Negocio();
		Prenda.setValorDelNegocio(100);
		fechaDeHoy = new Fecha(25,03,2016);
		Venta.setFechaActual(fechaDeHoy);
		unaCamisa = new Camisa();
		unPantalon = new Pantalon();
		unSaco = new Saco();
	}
	
	@Test
	public void elPrecioFinalDeUnaCamisaNacionalEsDe300(){
		Assert.assertEquals(300,unaCamisa.precioTotal(),0.001);
	}

	@Test
	public void elPrecioFinalDeUnaCamisaImportadaEsDe390(){
		unaCamisa.esImportada();
		Assert.assertEquals(390, unaCamisa.precioTotal(), 0.001);
	}
	
	@Test
	public void elPrecioFinalDeunPantalonNacionalEsDe350(){
		Assert.assertEquals(350,unPantalon.precioTotal(),0.001);
	}

	@Test
	public void elPrecioFinalDeunPantalonImportadoEsDe455(){
		unPantalon.esImportada();
		Assert.assertEquals(455,unPantalon.precioTotal(),0.001);
	}
	
	@Test
	public void elPrecioFinalDeUnSacoNacionalEsDe400(){
		Assert.assertEquals(400,unSaco.precioTotal(),0.001);
	}

	@Test
	public void elPrecioFinalDeUnSacoImportadaEsDe520(){
		unSaco.esImportada();
		Assert.assertEquals(520,unSaco.precioTotal(),0.001);
	}
	
	@Test
	public void laGananciaDeVender3CamisasNacionalesEnUnaSolaVentaEs900(){
		unaVenta= new Venta(unaCamisa, 3);
		Assert.assertEquals(900,unaVenta.valor(),0.001);
	}
	
	@Test
	public void laGananciaDeVender2SacosImportadosEnUnaSolaVentaEs1040(){
		unSaco.esImportada();
		unaVenta= new Venta(unSaco,2);
		Assert.assertEquals(1040,unaVenta.valor(),0.001);
	}
	
	@Test
	public void laGananciaDeVenderUnTrajeNacionalEs1050(){
		macowins.vender(unPantalon, 1);
		macowins.vender(unSaco, 1);
		macowins.vender(unaCamisa, 1);
		Assert.assertEquals(1050,macowins.gananciaDelDia(fechaDeHoy),0.001);
	}

	@Test
	public void laVentaFueRealizadaEl25032016(){
		unaVenta = new Venta(unPantalon, 2);
		Assert.assertTrue(unaVenta.sucedioEl(fechaDeHoy));
	}
}
