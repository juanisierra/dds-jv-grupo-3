package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Fecha {
	private int mes;
	private int dia;
	private int anio;
	 public Fecha(int diaFecha, int mesFecha, int anioFecha) {
		 this.mes=mesFecha;
		 this.anio=anioFecha;
		 this.dia=diaFecha;
	 }
	public int getMes() {
		return mes;
	}
	public int getDia() {
		return dia;
	}
	public int getAnio() {
		return anio;
	}
	 public boolean esIgualA(Fecha fecha2) {
		 return (fecha2.getAnio()==this.getAnio() && fecha2.getMes()==this.getMes() && fecha2.getDia()==this.getDia());
	 }
}
