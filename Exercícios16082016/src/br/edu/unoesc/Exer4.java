package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer4 {
	static String sexo;

	public static double pesoIdeal(double h) {
		double pesoideal = 0;
		if (sexo.equalsIgnoreCase("m")) {
			pesoideal = (72.7 * h) - 58;
		}
		if (sexo.equalsIgnoreCase("f")) {
			pesoideal = (62.2 * h) - 44.7;
		}

		return pesoideal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#0.0");
		System.out.println("Digite o seu sexo: ");
		sexo = sc.next();
		System.out.println("Digite a sua altura: ");
		double h = sc.nextDouble();
		double peso = pesoIdeal(h);
		System.out.println("Peso Ideal: " + ft.format(peso) + " Kg");
		sc.close();
	}

}
