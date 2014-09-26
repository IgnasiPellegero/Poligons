package Poligon;

public abstract class Poligon implements Comparable<Poligon>{
	
	abstract double calcularArea();

	@Override
	public int compareTo(Poligon o) {
		// TODO Auto-generated method stub
		return (int) (this.calcularArea() - o.calcularArea());
	}
	
	
}
