package ar.edu.utn.dds.k3001.grupo3.macowins;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests 
{

	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	@Test
	public void test() 
	{
		
		Camisa unaCamisa = new Camisa();
		Camisa otraCamisa = new Camisa();
		Mercado mercado = new Mercado();
		Fecha fechauno = new Fecha();
		Fecha fechados = new Fecha(1,2,3);
		mercado.ventaNueva(unaCamisa, 2, fechauno);
		mercado.ventaNueva(otraCamisa, 1, fechados);
		double recaudacion = mercado.recaudacionDelDia(fechauno);
		assertEquals(410 , (int)recaudacion);
	}

}
