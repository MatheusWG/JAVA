package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer1 {

	public static double conversao(double c) {

		double f = c * 1.8 + 32;
		return f;
	}

	public static void main(String[] args) {
		Boolean groto = true;
		Boolean gay = true;
		Scanner sc = new Scanner(System.in);
		while (groto == gay) {
			NumberFormat ft = new DecimalFormat("#0.00");
			System.out.println("Digite a temperatura em graus Celsius: ");
			double c = sc.nextDouble();
			double f = conversao(c);
			System.out.println("Graus em Farhenheit: " + ft.format(f));
		}
		sc.close();
	}

}
