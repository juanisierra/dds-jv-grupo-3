package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Saco extends Prenda
{	private int cantidadBotones;
	public Saco(Marca marca, boolean esImportado, int cantidadDeBotones) {
		this.marca=marca;
		this.esImportada=esImportado;
		this.cantidadBotones=cantidadDeBotones;
	}

	public double precioBase() {
		return 300+(10*cantidadBotones);
	}
}
