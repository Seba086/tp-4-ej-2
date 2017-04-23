package paquetito;

import java.util.ArrayList;
import java.util.Collections;

public class Mochila {
	private double capacidad;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Producto> productosSeleccionados = new ArrayList<Producto>();

	public Mochila(double c) {
		this.capacidad = c;
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	/*public ArrayList<Producto> seleccionadorDeProductos(ArrayList<Producto> productosASeleccionar) {
		productos = productosASeleccionar;
		Collections.sort(productos, new ComparadorProducto());
		System.out.println(productos);
		Producto p;
		
		while (!productos.isEmpty() && !solucion()) {
			p = seleccionar(productos); // determina el mejor candidatos del conjunto a seleccionar.
			productosSeleccionados.add(p);
			this.capacidad -= p.getPeso();
			productos.remove(p);
		}
		return productosSeleccionados;

	}*/
	public ArrayList<Producto> seleccionadorDeProductos(ArrayList<Producto> productosASeleccionar) {
		productos = productosASeleccionar;
		Collections.sort(productos, new ComparadorProducto());
		//System.out.println(productos);
		for(Producto p : productos){
			if(p.getPeso() <= this.capacidad){
				productosSeleccionados.add(p);
				capacidad -= p.getPeso();
			}
			
		}
		return productosSeleccionados;
	}
	private boolean solucion() {
		return this.capacidad == 0;
	}

	/*private Producto seleccionar(ArrayList<Producto> productos) {
		Producto p = new Producto();
		double x = 0;

		for (Producto d : productos) {
			if (((d.getValor() / d.getPeso()) > x) && ((this.capacidad - d.getPeso()) >= 0)) {
				x = d.getValor() / d.getPeso();
				p = d;
			} else if (d.getPeso() > this.capacidad){
				productos.remove(d);
			}
		}
		return p;

	}*/

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	

}
