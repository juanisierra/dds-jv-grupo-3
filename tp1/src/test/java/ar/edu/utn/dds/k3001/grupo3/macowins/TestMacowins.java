package ar.edu.utn.dds.k3001.grupo3.macowins;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class TestMacowins {
	private Negocio unNegocio;
	private Pantalon unPantalon;
	private Camisa unaCamisa;
	private Saco unSaco;
	private Venta unaCompra;
	
	@Before
	public void initialize() {
		unNegocio= new Negocio(200,0.3);
	}
	@Test
	public void unPantalonNoImportadoCuesta450 () {
		
		unPantalon=new Pantalon();
		unPantalon.setPrecioBase(250);
		unPantalon.setIsImportada(false);
		unaCompra=new Venta(unPantalon,new Fecha(10,2,2016), 1);
		Assert.assertEquals(450,unNegocio.precioFinal(unaCompra));
	}
	@Test
	public void unPantalonImportadoCuesta585 () {
		unPantalon=new Pantalon();
		unPantalon.setPrecioBase(250);
		unPantalon.setIsImportada(true);
		unaCompra=new Venta(unPantalon,new Fecha(10,2,2016), 1);
		Assert.assertEquals(585,unNegocio.precioFinal(unaCompra));
	}
	@Test
	public void comprasEnUndiaDan1170() {
		unNegocio = new Negocio(200,0.3);
		unPantalon=new Pantalon();
		unPantalon.setPrecioBase(250);
		unPantalon.setIsImportada(true);
		unNegocio.vender(new Fecha(01,20,2016), unPantalon, 2);
		unNegocio.vender(new Fecha(02,20,2016), unPantalon, 2);
		Assert.assertEquals(910,unNegocio.ganancia(new Fecha(01,20,2016)));
		
	}
	@Test
	public void doscomprasEnUndiaDan2340() {
		unNegocio = new Negocio(200,0.3);
		unPantalon=new Pantalon();
		unPantalon.setPrecioBase(250);
		unPantalon.setIsImportada(true);
		unNegocio.vender(new Fecha(01,20,2016), unPantalon, 2);
		unNegocio.vender(new Fecha(01,20,2016), unPantalon, 2);
		unNegocio.vender(new Fecha(02,20,2016), unPantalon, 2);
		Assert.assertEquals(1820,unNegocio.ganancia(new Fecha(01,20,2016)));
		
	}
}