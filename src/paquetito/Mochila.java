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

	public ArrayList<Producto> seleccionadorDeProductos(ArrayList<Producto> productosASeleccionar) {
		productos = productosASeleccionar;
		Collections.sort(productos, new ComparadorProducto());
		for (Producto p : productos) {
			while ((p.getPeso() <= this.capacidad) && p.hasStock()) {
				productosSeleccionados.add(p);
				capacidad -= p.getPeso();
				p.restaStock();
			}

		}
		return productosSeleccionados;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

}
