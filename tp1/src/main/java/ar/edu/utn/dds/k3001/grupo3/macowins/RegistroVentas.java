package ar.edu.utn.dds.k3001.grupo3.macowins;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegistroVentas {
	private List<Venta> ventas = new ArrayList<Venta>();
	
	public void agregarVenta(Venta venta){
		this.getVentas().add(venta);
	}
	
	public void eliminarVenta(Venta venta){
		this.getVentas().remove(venta);
	}
	
	public List<Venta> ventasPorDia(int dia){
		return this.getVentas().stream()
				.filter(venta->venta.getFecha()==dia)
				.collect(Collectors.toList());
	}
	
	public double gananciaPorDia(int dia){
		return sumatoria(this
				.ventasPorDia(dia)
				.stream()
				.map(venta->venta.importeTotal())
				.collect(Collectors.toList()));	
	}
	
	private double sumatoria (List<Double> lista){
		double sum=0;
		for(int i=0;i<lista.size();i++){
			sum = sum + lista.get(i);
		}
		return sum;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	
	
}
