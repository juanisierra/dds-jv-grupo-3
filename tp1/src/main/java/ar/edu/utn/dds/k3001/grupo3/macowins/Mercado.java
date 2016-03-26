package ar.edu.utn.dds.k3001.grupo3.macowins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mercado 
{
	List<Venta> array = Collections.synchronizedList(new ArrayList());
	public void ventaNueva(Prenda objeto, int cant, Fecha fecha)
	{
		Venta unaVenta = new Venta(objeto, cant, fecha);
		array.add(unaVenta);
	}
	public double recaudacionDelDia(Fecha fecha)
	{
		double total = 0;
		int cantElementos = array.size();
		cantElementos--;
		Venta unaVenta;
		while(cantElementos >= 0)
		{
			unaVenta = (Venta) array.get(cantElementos);
			if(unaVenta.sucedioEl(fecha))
			{
				total = total + unaVenta.valor();
			}
			cantElementos--;
		}
		return total;
	}
	public static void main(String[] args) 
	{
		//
	}
}
