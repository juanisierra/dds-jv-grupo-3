package ar.edu.utn.dds.k3001.grupo3;

//import java.util.List;
//import java.util.ArrayList;
import java.util.Date;

public class Venta 
{
	public int cantidad;
	public Date fecha;
	public Prenda prenda;
	
	public double importe()
	{
		return cantidad * this.prenda.precioFinal();
	}
	
	public void asignarPrenda(Prenda prenda)
	{
		this.prenda = prenda;
	}
	
	public void asignarFecha(Date date)
	{
		this.fecha = date;
	}
	
	public void asignarCantidad(int cant)
	{
		this.cantidad = cant;
	}
	
	public Date fecha()
	{
		return fecha;
	}
}

