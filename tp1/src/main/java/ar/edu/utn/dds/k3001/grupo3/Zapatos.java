package ar.edu.utn.dds.k3001.grupo3;

public class Zapatos extends Prenda
{
	public int talle;
	
	public double precioBase()
	{
		return 400 + (5*talle);
	}
	
	public void asignarTalle(int talle)
	{
		this.talle = talle;
	}
}
