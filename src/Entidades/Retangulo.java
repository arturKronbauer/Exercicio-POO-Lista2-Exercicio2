package Entidades;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public Double getArea() {
		return altura * largura;
	}
	
	public Double getPerimetro() {
		return (altura * 2) + (largura * 2);
	}
	
	public Double getDiagonal() {
		double diagonal;
		double a = Math.pow(altura, 2);
		double b = Math.pow(largura, 2);
		double c = a + b;
		diagonal = Math.sqrt(c);
		return diagonal;
	}
}
