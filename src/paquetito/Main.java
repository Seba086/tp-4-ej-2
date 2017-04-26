package paquetito;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mochila m = new Mochila(120);
		ArrayList<Producto> productosASeleccionar = new ArrayList<Producto>();
		Producto p0 = new Producto("Adaptador USB", 1, 100, 11);
		Producto p1 = new Producto("Pendrive 4GB", 1, 80, 5);
		Producto p2 = new Producto("Pendrive 8GB", 2, 160, 10);
		Producto p3 = new Producto("Pendrive 16GB", 3, 250, 15);
		Producto p4 = new Producto("Memorias DDR4 4 GB", 3, 1020, 3);
		Producto p5 = new Producto("Memorias DDR4 8 GB", 3, 1400, 3);
		Producto p6 = new Producto("Memorias DDR4 16 GB", 3, 2100, 3);
		Producto p7 = new Producto("Auriculares Sony", 3, 250, 1);
		Producto p8 = new Producto("Teclado inalambrico", 1, 150, 3);
		Producto p9 = new Producto("Mouse Genius", 2, 99, 2);
		Producto p10 = new Producto("Fuente 500W", 4, 650, 1);
		
		productosASeleccionar.add(p0);
		productosASeleccionar.add(p1);
		productosASeleccionar.add(p2);
		productosASeleccionar.add(p3);
		productosASeleccionar.add(p4);
		productosASeleccionar.add(p9);
		productosASeleccionar.add(p5);
		productosASeleccionar.add(p6);
		productosASeleccionar.add(p7);
		productosASeleccionar.add(p3);
		productosASeleccionar.add(p5);
		productosASeleccionar.add(p10);
		productosASeleccionar.add(p8);
		System.out.println("Capacidad inicial de la Mochila: " + m.getCapacidad());
		System.out.println("Contenido de la Mochila: ");
		System.out.println(m.seleccionadorDeProductos(productosASeleccionar).toString());
		System.out.println("Capacidad final de la Mochila : " + m.getCapacidad());
		
		
	}

}
