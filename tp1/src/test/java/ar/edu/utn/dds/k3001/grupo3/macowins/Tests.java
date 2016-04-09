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
	private Sarkany marcaSarkany;
	private Armani marcaArmani;
	@Before
	public void init(){
		macowins = new Negocio();
		Prenda.setValorDelNegocio(100);
		fechaDeHoy = new Fecha(25,03,2016);
		Venta.setFechaActual(fechaDeHoy);
		marcaSarkany = new Sarkany();
		marcaArmani = new Armani();
	}
	
	@Test
	public void elPrecioFinalDeUnaCamisaSarkanyNacionalEsDe330(){
		unaCamisa= new Camisa(marcaSarkany, false);
		Assert.assertEquals(330,unaCamisa.precioTotal(),0.001);
	}

	@Test
	public void elPrecioFinalDeUnaCamisaSarkanyImportadaEsDe429(){
		unaCamisa= new Camisa(marcaSarkany, true);
		Assert.assertEquals(429, unaCamisa.precioTotal(), 0.001);
	}
	
	@Test
	public void elPrecioFinalDeunPantalon3cm2ArmaniImportadoEsDe757(){
		unPantalon = new Pantalon(marcaArmani , true,3);
		Assert.assertEquals(757,unPantalon.precioTotal(),1);
	}
	
	@Test
	public void elPrecioFinalDeUnSacoNacionalArmani2BotonesEsDe693(){
		unSaco = new Saco(marcaArmani, false, 2);
		Assert.assertEquals(693,unSaco.precioTotal(),0.001);
	}

	@Test
	public void laGananciaDeVender3CamisasNacionalesEnUnaSolaVentaEs990(){
		unaCamisa = new Camisa(marcaSarkany, false);
		unaVenta= new Venta(unaCamisa, 3);
		Assert.assertEquals(990,unaVenta.valor(),0.001);
	}
	
	@Test
	public void laGananciaDeVender2SacosImportadosEnUnaSolaVentaEs1801(){
		unSaco = new Saco(marcaArmani,true,2);
		unaVenta= new Venta(unSaco,2);
		Assert.assertEquals(1801,unaVenta.valor(),1);
	}
	
	@Test
	public void laGananciaDeVenderUnTrajeNacionalEs1768(){
		unPantalon = new Pantalon(marcaArmani, false, 2);
		unSaco = new Saco(marcaArmani, false, 2);
		unaCamisa = new Camisa(marcaArmani,false);
		macowins.vender(unPantalon, 1);
		macowins.vender(unSaco, 1);
		macowins.vender(unaCamisa, 1);
		Assert.assertEquals(1768,macowins.gananciaDelDia(fechaDeHoy),1);
	}

	@Test
	public void laVentaFueRealizadaEl25032016(){
		unPantalon = new Pantalon(marcaSarkany, true, 2);
		unaVenta = new Venta(unPantalon, 2);
		Assert.assertTrue(unaVenta.sucedioEl(fechaDeHoy));
	}
}
