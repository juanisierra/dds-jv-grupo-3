package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Sarkany implements Marca {

	@Override
	public double importeFinal(double precio) {
		if(precio > 500) {
			return precio*1.35;
		} else {
		return precio*1.1;
	}
	}

}
