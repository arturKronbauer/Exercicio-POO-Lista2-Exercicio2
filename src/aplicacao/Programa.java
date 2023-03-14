package aplicacao;

import java.util.Scanner;

import Entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a largura e altura do retângulo: ");
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		Retangulo retangulo = new Retangulo(largura, altura);
		System.out.println();
		System.out.println("Área = "+String.format("%.2f", retangulo.getArea())); 
		System.out.println("Perímetro = "+String.format("%.2f", retangulo.getPerimetro()));
		System.out.println("Diagonal = "+String.format("%.2f", retangulo.getDiagonal()));
		sc.close();
	}
}
