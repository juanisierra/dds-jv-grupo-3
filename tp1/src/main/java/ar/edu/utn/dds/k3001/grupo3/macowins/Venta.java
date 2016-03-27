package ar.edu.utn.dds.k3001.grupo3.macowins;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Venta {

	public Prenda prenda;
	public int cantidad;
	public Date fechaActual = new Date(); 

	public Venta(Prenda ropa, int cant){
		prenda= ropa;
		cantidad = cant;
		fechaActual = new Date();
	}

	public Prenda getPrendaVendida(){
		return prenda;
	}
	
	public int getCantidadesVendidas(){
		return cantidad;
	}

	public String getFechaDeVenta(){
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(fechaActual);
    }
	
	public double getGananciaDeVenta(Venta venta, Negocio local){
		return ((local.precioFinal(prenda))*cantidad);
	}
	
	public double getGananciaDeVentaSiFueEl(String fecha, Negocio local){
		if((this.getFechaDeVenta()).equals(fecha)){
			return (this.getGananciaDeVenta(this, local));
		}
		else return 0;
	}
	
}
