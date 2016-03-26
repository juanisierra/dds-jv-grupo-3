package ar.edu.utn.dds.k3001.grupo3.macowins;

public abstract class Prenda {
	private int precioBase;
	private boolean isImportada;
	public boolean isImportada() {
		return isImportada;
	}

	public void setPrecioBase(int cantidad) {
		precioBase= cantidad;
	}
	public void setIsImportada(boolean es) {
		isImportada=es;
	}
	public int precio() {
		return precioBase;
	}
}
