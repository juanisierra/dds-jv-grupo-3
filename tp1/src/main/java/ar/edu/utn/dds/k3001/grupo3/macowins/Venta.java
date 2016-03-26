package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Venta {
	private Prenda prendaVendida;
	private Fecha fechaVenta;
	private int cantidadPrenda;
	public Venta(Prenda prenda, Fecha fecha, int cantidad) {
		this.prendaVendida=prenda;
		this.fechaVenta=fecha;
		this.cantidadPrenda=cantidad;
	}
	public boolean fueEl(Fecha fechaDeseada) {
		return fechaDeseada.esIgualA(fechaVenta);
	}
	public int precio() {
		return (prendaVendida.precio()*cantidadPrenda);
	}
	public boolean esVentaImportada() {
		return prendaVendida.isImportada();
	}
	
}
