package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Camisa extends Prenda 
{		
	public Camisa(Marca marca,boolean esImportada) {
		this.esImportada=esImportada;
		this.marca=marca;
		}

	@Override
	public double precioBase() {
		return 200;
	}
}
