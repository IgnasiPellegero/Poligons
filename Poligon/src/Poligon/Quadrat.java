package Poligon;

public class Quadrat extends Poligon {
	
	double base, altura;

	public Quadrat(double base, double altura) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
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
		return "Quadrat [base=" + base + ", altura=" + altura + "]";
	}

}
