package paquetito;

import java.util.Comparator;

public class ComparadorProducto implements Comparator<Producto> {

	@Override
	public int compare(Producto o, Producto p) {
		if (o.getIndice() > p.getIndice()) {
			return -1;
		} else if (o.getIndice() < (p.getIndice())) {
			return 1;
		} else {
			return comparePeso(o, p);
		}

	}

	private int comparePeso(Producto o, Producto p) {
		if (o.getPeso() < p.getPeso()) {
			return -1;
		} else if (o.getPeso() > p.getPeso()) {
			return 1;
		} else {
			return compareNombre(o, p);
		}
	}

	private int compareNombre(Producto o, Producto p) {
		return o.getNombre().compareTo(p.getNombre());
	}
}
