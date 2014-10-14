package Poligon;

public class Triangle extends Poligon {
	
	private double base, altura;

	public Triangle(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", altura=" + altura + "]";
	}

}
