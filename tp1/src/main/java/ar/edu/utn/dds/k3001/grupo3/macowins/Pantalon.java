package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Pantalon extends Prenda
{	private double cm2Tela;

	public Pantalon(Marca marca, boolean esImportado,double cm2Tela) {
		this.esImportada=esImportado;
		this.cm2Tela=cm2Tela;
		this.marca=marca;
	}
	public double precioBase() {
			return 250+cm2Tela;
		}
}
