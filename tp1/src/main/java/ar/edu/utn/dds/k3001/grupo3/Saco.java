package ar.edu.utn.dds.k3001.grupo3;

public class Saco extends Prenda
{
	public int cantidadBotones;
	
	public double precioBase()
	{
		return 300 + (10*cantidadBotones);
	}
	
	public void asignarCantidadBotones(int cantB)
	{
		this.cantidadBotones = cantB;
	}
}
