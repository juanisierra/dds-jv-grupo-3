package ar.edu.utn.dds.k3001.grupo3.macowins;

import java.util.*;
import java.util.stream.Stream;

public class Negocio {
	private int costoFijo;
	private double tasaImportacion;
	private List<Venta> ventas;

	public  Negocio(int costoFijo, double tasaImportacion) {
		this.costoFijo=costoFijo;
		this.tasaImportacion=tasaImportacion;
		this.ventas = new LinkedList<Venta>();
	}
	public void vender(Fecha fecha, Prenda prenda,int cantidad)
	{
		Venta unaVenta = new Venta(prenda,fecha,cantidad);
		ventas.add(unaVenta);
	}
	public int precioFinal(Venta venta) {
		int precio=venta.precio()+costoFijo;
		if(venta.esVentaImportada()) {
			precio*=(1+tasaImportacion);
		}
		return precio;
	}

	public int ganancia(Fecha fecha) {
		Stream<Venta> listaVentas = ventas.stream();
		return listaVentas.filter(venta -> venta.fueEl(fecha)).mapToInt(venta -> this.precioFinal(venta)).sum();

	}
}
