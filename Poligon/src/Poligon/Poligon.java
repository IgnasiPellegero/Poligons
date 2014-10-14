package Poligon;

public abstract class Poligon implements Comparable<Poligon>{
	
	public abstract double calcularArea();

	@Override
	public int compareTo(Poligon o) {
		// Comparem les àrees
		return (int) (this.calcularArea() - o.calcularArea());
	}
}
