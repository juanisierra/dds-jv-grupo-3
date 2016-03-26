package ar.edu.utn.dds.k3001.grupo3;

import ar.edu.utn.dds.k3001.grupo3.Armani;
import ar.edu.utn.dds.k3001.grupo3.Camisa;
import ar.edu.utn.dds.k3001.grupo3.Importado;
import ar.edu.utn.dds.k3001.grupo3.Nacional;
import ar.edu.utn.dds.k3001.grupo3.Negocio;
import ar.edu.utn.dds.k3001.grupo3.Pantalones;
import ar.edu.utn.dds.k3001.grupo3.Saco;
import ar.edu.utn.dds.k3001.grupo3.Sarkany;
import ar.edu.utn.dds.k3001.grupo3.Sombrero;
import ar.edu.utn.dds.k3001.grupo3.Venta;
import ar.edu.utn.dds.k3001.grupo3.Zapatos;
import org.junit.Test;
import org.junit.Assert;

public class Tests 
{
	Zapatos zapatos = new Zapatos();
	Saco saco = new Saco();
	Pantalones pantalones = new Pantalones();
	Camisa camisa = new Camisa();
	Sombrero sombrero = new Sombrero();
	Nacional nacional = new Nacional();
	Importado importado = new Importado();
	Armani armani = new Armani();
	Sarkany sarkany = new Sarkany();
	Negocio negocio = new Negocio();
	Venta venta = new Venta();
	
	
	@Test
	public void testVendiTresCamisas()
	{
		camisa.asignarNegocio(negocio);
		camisa.asignarOrigen(nacional);
		camisa.asignarMarca(armani);
		negocio.asignarValorFijo(100);
		venta.asignarPrenda(camisa);
		venta.asignarCantidad(3);
		Assert.assertEquals(1485, venta.importe(), 0);
	}
	
	
	@Test
	public void testSombreroArmani()
	{
		sombrero.asignarNegocio(negocio);
		sombrero.asignarMarca(armani);
		sombrero.asignarOrigen(nacional);
		sombrero.asignarIndice(4);
		negocio.asignarValorFijo(0);
		Assert.assertEquals(1237.5, sombrero.precioFinal(), 0);
	}
	
	
	@Test
	public void testZapatosSarkany()
	{
		zapatos.asignarMarca(sarkany);
		zapatos.asignarNegocio(negocio);
		zapatos.asignarOrigen(importado);
		zapatos.asignarTalle(40);
		negocio.asignarValorFijo(100);
		Assert.assertEquals(1228.5, zapatos.precioFinal(), 0);
	}
	
	
	@Test
	public void testSacoCincoBotonesSarkany()
	{
		saco.asignarMarca(sarkany);
		saco.asignarNegocio(negocio);
		saco.asignarOrigen(nacional);
		saco.asignarCantidadBotones(5);
		negocio.asignarValorFijo(100);
		Assert.assertEquals(495, Math.round(saco.precioFinal()), 0);
	}
	
	
	@Test
	public void testPantalonesDoscientosCmCuadrados()
	{
		pantalones.asignarCentimetrosCuadrados(200);
		pantalones.asignarMarca(armani);
		pantalones.asignarNegocio(negocio);
		pantalones.asignarOrigen(nacional);
		negocio.asignarValorFijo(0);
		Assert.assertEquals(742.5, pantalones.precioFinal(), 0);
	}
}
