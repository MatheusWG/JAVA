package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer6 {
	static double x1 = 0;
	static double x2 = 0;

	public static void bhaskara(int a, int b, int c) {
		double X = b * b - 4 * a * c;
		if (X >= 0) {
			x1 = (-b + Math.sqrt(X)) / (2 * a);
			x2 = (-b - Math.sqrt(X)) / (2 * a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#0.00");
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();
		bhaskara(a, b, c);
		System.out.println("Raiz 1: " + ft.format(x1));
		System.out.println("Raiz 2: " + ft.format(x2));
		sc.close();
	}
}
