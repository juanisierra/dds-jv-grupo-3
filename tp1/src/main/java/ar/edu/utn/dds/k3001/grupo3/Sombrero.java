package ar.edu.utn.dds.k3001.grupo3;

public class Sombrero extends Prenda
{
	public double indiceMetrosexualidad;
	
	public double precioBase()
	{
		return 150*(1 + indiceMetrosexualidad);
	}
	
	public void asignarIndice(double indice)
	{
		this.indiceMetrosexualidad = indice;
	}
}
