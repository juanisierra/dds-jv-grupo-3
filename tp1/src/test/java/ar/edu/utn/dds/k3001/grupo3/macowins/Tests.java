package ar.edu.utn.dds.k3001.grupo3.macowins;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests 
{	private Negocio unNegocio;

	@Before
	public void setUp() throws Exception 
	{
		unNegocio = new Negocio();
		Prenda.setValorDelNegocio(100);
	}
	
	@Test
	public void test() 
	{
		
		Camisa unaCamisa = new Camisa(0.3);
		Camisa otraCamisa = new Camisa(0.3);
		Fecha fechauno = new Fecha();
		Fecha fechados = new Fecha(1,2,3);
		unNegocio.vender(fechauno,unaCamisa, 2);
		unNegocio.vender(fechados,otraCamisa, 1);
		double recaudacion = unNegocio.gananciaDelDia(fechauno);
		assertEquals(780 , (int)recaudacion);
	}

}
