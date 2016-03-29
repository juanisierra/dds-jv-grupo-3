package ar.edu.utn.dds.k3001.grupo3.macowins;

import java.util.*;
import java.util.stream.Stream;

public class Negocio {

	private List<Venta> ventas;

	public  Negocio() {
		this.ventas = new LinkedList<Venta>();
	}
	
	public void vender(Prenda prenda,int cantidad){
		Venta unaVenta = new Venta(prenda,cantidad);
		ventas.add(unaVenta);
	}

	public double gananciaDelDia(Fecha fecha) {
		Stream<Venta> listaVentas = ventas.stream();
		return listaVentas.filter(venta -> venta.sucedioEl(fecha)).mapToDouble(venta -> venta.valor()).sum();
	}
}
