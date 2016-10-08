package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer3 {
	static double a, b;

	public static void trocarNumero() {
		double aux;
		aux = a;
		a = b;
		b = aux;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#0");
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		b = sc.nextDouble();
		trocarNumero();
		System.out.println("A: " + ft.format(a));
		System.out.println("B: " + ft.format(b));
		sc.close();
	}

}
