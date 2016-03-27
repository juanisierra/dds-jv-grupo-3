package ar.edu.utn.dds.k3001.grupo3.macowins;

import java.util.*;
import java.util.stream.Stream;

public class Negocio {
	private int valorDeNegocio;
	public List<Venta> ventas;	
	private Venta venta;
	public Prenda prenda;
	public int cant;
	public String dia;
		
	public void setValorDeNegocio(int X){
		this.valorDeNegocio = X;
	}
	
	public double tasaDeImportacion(Prenda prenda){
		if(prenda.getOrigen() == 1){ //significa que es importada
			return (1.3);
		}
		else{
			return 1.0;
		}
	}
		
	public double precioFinal(Prenda prenda){
		return (this.valorDeNegocio + prenda.getPrecioBase())* tasaDeImportacion(prenda);
	}
	
	public void ventas(){
		ventas =new LinkedList<Venta>();
	}
	
	public void registrarVenta(Prenda prenda, int cant){
		venta =new Venta(prenda, cant);
		ventas.add(venta); 
	}
	
	public double gananciasDelDia(String dia){ //dia debe tener el formato "dd-MM-YYYY"
		Stream<Venta> listaDeVentas =ventas.stream();
		return ((listaDeVentas.mapToDouble(venta-> venta.getGananciaDeVentaSiFueEl(dia, this))).sum());
	}
	
}




