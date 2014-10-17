package Poligon;

public abstract class Poligon implements Comparable<Poligon>{
	
	public abstract double calcularArea();

	@Override
	public int compareTo(Poligon p) {
		
		double miArea = this.calcularArea();
		double pArea = p.calcularArea();
		
		if(miArea<pArea) return -1;
		if(miArea>pArea) return 1;
		
		return 0;
	}
}
