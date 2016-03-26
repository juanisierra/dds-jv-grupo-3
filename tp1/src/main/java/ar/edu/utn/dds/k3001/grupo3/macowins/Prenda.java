package ar.edu.utn.dds.k3001.grupo3.macowins;

public abstract class Prenda 
{
	private static double valorDelNegocio=5;
	public double precioBase;
	public double tasaDeImportacion;
	public void esImporado()
	{
		this.tasaDeImportacion = 1.3;
	}
	public double precioTotal()
	{
		return ((this.precioBase + valorDelNegocio) * this.tasaDeImportacion );
	}
	public static void setValorDelNegocio(double valorDelNegocio) 
	{
		Prenda.valorDelNegocio = valorDelNegocio;
	}
}
