package ar.edu.utn.dds.k3001.grupo3.macowins;

public class Prenda {
	public int precioBase;
	public int origen;
		
	public void precioBase(){
		}
	
	public int getPrecioBase(){//para no romper el encapsulamiento 
		return (precioBase);
	}
	
	public void setOrigen(int valor){
		this.origen=valor;// los valores pueden ser 0, significando que es nacional, o 1, siendo importada
	}
	
	public int getOrigen(){//para no romper el encapsulamiento
		return origen;
	}
}
