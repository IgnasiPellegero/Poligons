package Poligon;

public class Triangle extends Poligon {
	
	double base, altura;

	public Triangle(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea(double base, double altura) {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

}
