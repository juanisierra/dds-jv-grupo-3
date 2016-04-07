package ar.edu.utn.dds.k3001.grupo3.macowins;

public abstract class Prenda 
{	private Marca marca;
	private static double valorDelNegocio;
	private double tasaDeImportacion;
	
	public double precioParcial()
	{
		return ((this.precioBase() + valorDelNegocio) * (1+tasaDeImportacion) );
	}
	public double precioTotal() 
	{
		return marca.importeFinal(this.precioParcial());
	}
	public static void setValorDelNegocio(double valorDelNegocio) 
	{
		Prenda.valorDelNegocio = valorDelNegocio;
	}
	
	public void esImportada(){
		tasaDeImportacion = 0.3;
	}
}
