package aula04;

import java.util.Scanner;

public class Exercicio02 {

	public static double calcularVolume(double raio, double altura) {
		double volume = 0;
		volume = Math.PI * Math.pow(raio,2) * altura;
		return volume;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a altura");
		double altura = teclado.nextDouble();
		System.out.println("Informe o raio");
		double raio = teclado.nextDouble();
		System.out.println("Resultado " + calcularVolume(raio,altura));
		teclado.close();
	}

}
