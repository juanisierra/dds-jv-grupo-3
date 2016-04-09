package ar.edu.utn.dds.k3001.grupo3.macowins;

public abstract class Prenda 
{	protected Marca marca;
	private static double valorDelNegocio;
	protected boolean esImportada;
	public abstract double precioBase();
	
	private double tasaImportacion() {
		if(esImportada==true) return 1.3;
		return 1;
	}
	public double precioParcial()
	{
		return ((this.precioBase() + valorDelNegocio) * this.tasaImportacion() );
	}
	public double precioTotal() 
	{
		return marca.importeFinal(this.precioParcial());
	}
	public static void setValorDelNegocio(double valorDelNegocio) 
	{
		Prenda.valorDelNegocio = valorDelNegocio;
	}
	
}
