package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Venta 
{
	private Prenda prendaVendida;
	private int cantidad;
	private Fecha fecha;
	public Venta(Prenda objeto, int cant, Fecha fechaDeVenta)
	{
		prendaVendida = objeto;
		cantidad = cant;
		fecha = fechaDeVenta;
	}
	public boolean sucedioEl(Fecha fechaAComparar)
	{
		return fecha.esIgual(fechaAComparar);
	}
	public double valor()
	{
		return (prendaVendida.precioTotal() * cantidad);
	}
	public Prenda getPrenda()
	{
		return prendaVendida;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	public Fecha getFecha()
	{
		return fecha;
	}
}
