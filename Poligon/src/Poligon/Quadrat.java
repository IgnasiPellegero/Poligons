package Poligon;

public class Quadrat extends Poligon {
	
	double base, altura;

	public Quadrat(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea(double base, double altura) {
		// TODO Auto-generated method stub
		return base * altura;
	}

}
