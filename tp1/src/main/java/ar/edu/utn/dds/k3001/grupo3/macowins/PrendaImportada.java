package ar.edu.utn.dds.k3001.grupo3.macowins;

public class PrendaImportada extends Prenda{
	private static double tasaImportacion = 1.3;
	
	public double precioFinal(){
		return (super.precioFinal()*this.getTasaImportacion());
	}
	
	public double getTasaImportacion(){
		return tasaImportacion;
	}
}
