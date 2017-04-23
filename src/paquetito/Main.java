package paquetito;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mochila m = new Mochila(120);
		ArrayList<Producto> productosASeleccionar = new ArrayList();
		Producto p1 = new Producto("Lata de Coca", 5, 5);
		Producto p2 = new Producto("Lata de Pepsi", 5, 1);
		Producto p3 = new Producto("Lingote de Bronce", 15, 10);
		Producto p4 = new Producto("Lingote de Plata", 20, 1025);
		Producto p6 = new Producto("Lingote de Oro", 30, 50);
		Producto p7 = new Producto("Lata de Coca", 5, 5);
		Producto p5 = new Producto("Lata de Manaos", 2, 11);
		
		productosASeleccionar.add(p1);
		productosASeleccionar.add(p2);
		productosASeleccionar.add(p3);
		productosASeleccionar.add(p4);
		productosASeleccionar.add(p4);
		productosASeleccionar.add(p5);
		productosASeleccionar.add(p6);
		productosASeleccionar.add(p7);
		productosASeleccionar.add(p3);
		productosASeleccionar.add(p5);
		System.out.println("Capacidad inicial: " + m.getCapacidad());
		System.out.println(m.seleccionadorDeProductos(productosASeleccionar).toString());
		System.out.println("Capacidad final: " + m.getCapacidad());
		
		
	}

}
