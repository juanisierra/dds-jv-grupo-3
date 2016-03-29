package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Fecha 
{
	private int dia;
	private int mes;
	private int anio;
	public Fecha(int diaF, int mesF, int anioF){
		dia = diaF;
		mes = mesF;
		anio = anioF;
	}
	
	public Fecha(){
		dia = 10;
		mes = 2;
		anio = 2016;
	}
	
	public boolean esIgual(Fecha fechaAComparar){
		boolean igualdad = (fechaAComparar.getDia() == dia && fechaAComparar.getMes() == mes && fechaAComparar.getAnio() == anio);
		return igualdad;
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAnio(){
		return anio;
	}	
}
