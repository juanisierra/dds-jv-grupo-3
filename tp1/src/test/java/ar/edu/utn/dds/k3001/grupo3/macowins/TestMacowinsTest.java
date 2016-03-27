package ar.edu.utn.dds.k3001.grupo3.macowins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMacowinsTest {
	private Pantalon jean;
	private Saco saco;
	private Camisa camisa;
	private Negocio macowins;

	@Before
	public void init(){
	jean = new Pantalon();
	saco = new Saco();
	camisa = new Camisa();
	macowins = new Negocio();
	
	jean.setPrecioBase();
	jean.setOrigen(1);
	saco.setPrecioBase();
	saco.setOrigen(0);
	camisa.setOrigen(1);
	camisa.setPrecioBase();
	macowins.setValorDeNegocio(100);
	macowins.tasaDeImportacion(jean);
	macowins.ventas(); 
	}
	
	@Test
	public void jeanTieneComoPrecioBase250(){
		Assert.assertEquals(250,jean.getPrecioBase());
	}
	
	@Test
	public void jeanEsImportado(){
		Assert.assertEquals(1,jean.getOrigen());
	}
	
	@Test
	public void jeanTieneUnPrecioFinalDe455(){
		Assert.assertTrue(455 == macowins.precioFinal(jean));		
	}
	
	@Test
	public void sacoTieneComoPrecioBase00(){
		Assert.assertEquals(300,saco.getPrecioBase());
	}
	
	@Test
	public void sacoNoEsImportado(){
		Assert.assertEquals(0,saco.getOrigen());
	}
	
	@Test
	public void sacoTieneUnPrecioFinalDe400(){
		Assert.assertTrue(400 == macowins.precioFinal(saco));
	}
	
	@Test
	public void camisaTieneComoPrecioBase200(){
		Assert.assertEquals(200,camisa.getPrecioBase());
	}
	
	@Test
	public void camisaEsImportado(){
		Assert.assertEquals(1,camisa.getOrigen());
	}
	
	@Test
	public void camisaTieneUnPrecioFinalDe390(){
		Assert.assertTrue(390 == macowins.precioFinal(camisa));
	}
	
	@Test
	public void hayPorLoMenosUnaVentaRegistrada(){
		macowins.registrarVenta(jean,2);
		Assert.assertFalse(macowins.ventas.isEmpty());
	}
		
	@Test
	public void hayExactamenteDosVentasRegistradas(){
		macowins.registrarVenta(jean,2);
		macowins.registrarVenta(camisa,4);
		Assert.assertTrue(2 == macowins.ventas.size());
	}
	
	@Test
	public void laVentaFueRealizadaEl27DeMarzo(){//como laventa se registra cada vez que se corre el test, hay que actualizar la fecha del test
		macowins.registrarVenta(jean,2);
		String fechaDeVenta = new String();
		fechaDeVenta = macowins.ventas.get(0).getFechaDeVenta();
		Assert.assertEquals("27-03-2016", fechaDeVenta);
	}
	
	@Test
	public void laGananciaDelDiaFueDe2470(){
		macowins.registrarVenta(jean,2);
		macowins.registrarVenta(camisa,4);
		Assert.assertEquals(2470,macowins.gananciasDelDia("27-03-2016"), 0.001);
	}
	
	@Test
	public void laGananciaDeVenderDosJeansEs910(){
		macowins.registrarVenta(jean,2);
		Assert.assertEquals(910, macowins.ventas.get(0).getGananciaDeVentaSiFueEl("27-03-2016", macowins), 0.001);
	}
	
	@Test
	public void laPrendaVendidaFueCamisas(){
		macowins.registrarVenta(camisa, 2);
		Assert.assertEquals(camisa, macowins.ventas.get(0).getPrendaVendida());
	}
	
	
}
