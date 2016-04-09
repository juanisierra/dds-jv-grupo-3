package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Zapatos extends Prenda{
	private int talle;
	public Zapatos(Marca marca, boolean esImportado, int talle) {
		this.marca=marca;
		this.esImportada=esImportado;
		this.talle=talle;
	}
	
	@Override
	public double precioBase() {
		return 400+(5*talle);
	}
}
