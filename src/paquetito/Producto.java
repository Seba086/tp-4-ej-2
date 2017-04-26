package paquetito;

public class Producto {
	private double peso;
	private double valor;
	private String nombre;
	private double indice;
	private int stock;

	public Producto() {

	}

	public Producto(String n, double p, double v, int s) {
		this.nombre = n;
		this.peso = p;
		this.valor = v;
		indice = valor / peso;
		this.stock = s;
	}

	@Override
	public String toString() {
		return "[" + nombre + ", " + getPeso() + ", $" + getValor() + ", indice p/v: " + getPeso() / getValor() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {
		return stock;
	}

	public boolean hasStock() {
		if (stock > 0)
			return true;
		else
			return false;
	}

	public void restaStock() {
		stock--;
	}

	public double getPeso() {
		return peso;
	}

	public double getValor() {
		return valor;
	}

	public double getIndice() {
		return indice;
	}

}
