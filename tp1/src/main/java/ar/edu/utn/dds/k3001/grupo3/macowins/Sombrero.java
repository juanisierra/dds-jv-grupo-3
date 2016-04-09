package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Sombrero extends Prenda {
	private double coefMetrosexualidad;
	
	public Sombrero(Marca marca,boolean esImportado, double coeficienteDeMetrosexualidad) {
		this.marca=marca;
		this.esImportada=esImportado;
		this.coefMetrosexualidad=coeficienteDeMetrosexualidad;
	}
	
	@Override
	public double precioBase() {
		return 150*(1+coefMetrosexualidad);
	}

}
