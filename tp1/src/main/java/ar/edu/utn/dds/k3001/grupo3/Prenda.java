package ar.edu.utn.dds.k3001.grupo3;

public abstract class Prenda 
{
	private Origen origen;
	private Negocio negocio;
	private Marca marca;
	
	
	public double precioFinal()
	{
		return (negocio.valorFijo() + precioBase()) 
		* origen.tasaImportacion() * marca.coeficiente(this);
	}
	
	public abstract double precioBase();
	
	public void asignarOrigen(Origen origen)
	{
		this.origen = origen;
	}
	
	public void asignarNegocio(Negocio negocio)
	{
		this.negocio = negocio;
	}
	
	public void asignarMarca(Marca marca)
	{
		this.marca = marca;
	}
	
	//public static void main(String[] args){ };
	
}

