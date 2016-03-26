package ar.edu.utn.dds.k3001.grupo3.macowins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

	Prenda nacional1= new Prenda();
	Prenda nacional2= new Prenda();
	Articulo articulo = new Pantalon();
	Prenda importada = new PrendaImportada();
	Venta venta1 = new Venta();
	Venta venta2 = new Venta();
	Venta venta3 = new Venta();
	RegistroVentas registro = new RegistroVentas();
	
	@Before
	public void init(){
		Prenda.setValorNegocio(1);
		nacional1.setArticulo(articulo);
		articulo = new Camisa();
		importada.setArticulo(articulo);
		articulo = new Saco();
		nacional2.setArticulo(articulo);
		venta1.setCantidad(3);
		venta1.setFecha(2201);
		venta1.setPrendaVendida(nacional1);
		venta2.setCantidad(2);
		venta2.setFecha(2201);
		venta2.setPrendaVendida(importada);
		venta3.setCantidad(5);
		venta3.setFecha(1402);
		venta3.setPrendaVendida(nacional2);
		registro.agregarVenta(venta1);
		registro.agregarVenta(venta2);
		registro.agregarVenta(venta3);
	}
	
	@Test
	public void TestValorDeNegocioCambiaYSeAsimila(){
		Prenda.setValorNegocio(20);
		Assert.assertTrue(nacional2.getValorNegocio()==20);
	}
	
	@Test
	public void TestImportadaEsCamisa(){
		Assert.assertTrue(importada.getArticulo().getPrecio()==200);
	}
	
	@Test
	public void TestPrecioFinalDeImportadaEstaOK(){
		Assert.assertTrue(importada.precioFinal()==261.3);
	}
	
	@Test	
	public void TestNacional1NoEsImportada() {
		Assert.assertTrue(nacional1.precioFinal()==251);
	}
	
	@Test
	public void TestImporteTotalDeVenta3EstaOK(){
		Assert.assertTrue(venta3.importeTotal()==1505);
	}
	
	@Test
	public void TestVentasDe2201Son2(){
		Assert.assertTrue(registro.ventasPorDia(2201).size()==2);
	}
	
	@Test
	public void TestNoHayVentasDe0101(){
		Assert.assertTrue(registro.ventasPorDia(0101).size()==0);
	}
	
	@Test
	public void TestGananciasDel2201EstaOK(){
		Assert.assertTrue(registro.gananciaPorDia(2201)==1275.6);
	}
	
	@Test
	public void TestGananciasDeFechaInexistente(){
		Assert.assertTrue(registro.gananciaPorDia(0101)==0);
	}
}
