package ar.edu.utn.dds.k3001.grupo3.macowins;

public abstract class Prenda 
{
	private static double valorDelNegocio=5;
	public double precioBase;
	public double tasaDeImportacion;

	public double precioTotal()
	{
		return ((precioBase + valorDelNegocio) * (1+tasaDeImportacion) );
	}
	public static void setValorDelNegocio(double valorDelNegocio) 
	{
		Prenda.valorDelNegocio = valorDelNegocio;
	}
	
	public void esImportada(){
		tasaDeImportacion = 0.3;
	}
}
