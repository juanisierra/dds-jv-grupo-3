package ar.edu.utn.dds.k3001.grupo3;

public class Pantalones extends Prenda
{
	public double cantCentimetrosCuadrados;
	
	public double precioBase()
	{
		return 250 + cantCentimetrosCuadrados;
	}
	
	public void asignarCentimetrosCuadrados(double cmc)
	{
		this.cantCentimetrosCuadrados = cmc;
	}
}