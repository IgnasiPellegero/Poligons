package Poligon;

public class Rombe extends Poligon{

	private double altura, amplada;

	public Rombe(double altura, double amplada) {
		this.altura = altura;
		this.amplada = amplada;
	}
	
	public double calcularArea() {
		return (altura*amplada) *2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAmplada() {
		return amplada;
	}

	public void setAmplada(double amplada) {
		this.amplada = amplada;
	}

	@Override
	public String toString() {
		return "Rombe [altura=" + altura + ", amplada=" + amplada + "]";
	}
	

}
