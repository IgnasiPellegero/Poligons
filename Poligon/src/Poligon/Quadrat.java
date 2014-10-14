package Poligon;

public class Quadrat extends Poligon {
	
	private double lado;

	public Quadrat(double lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrat [lado=" + lado + "]";
	}



}
