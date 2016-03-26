package ar.edu.utn.dds.k3001.grupo3;

public class Sarkany extends Marca
{
	public double coeficiente (Prenda prenda)
	{
		if (prenda.precioBase() < 500) 
		{
			return 1.1;
		}
		else 
		{
			return 1.35;
		}
	}
}