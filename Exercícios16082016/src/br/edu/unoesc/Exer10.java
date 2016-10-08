package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer10 {

	public static double somatorio(double n,double x) {
		double somatorio = 0;
		for (int i = 1; i <= n; i++) {
			double a = Math.log(x)/Math.log(i);
		 somatorio += (a * (a + 1)) / 2;
		}
		return somatorio;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#0");
		System.out.println("Digite um valor para n: ");
		double n = sc.nextDouble();
		System.out.println("Digite um valor para x: ");
		double x = sc.nextDouble();
		double somatorio = somatorio(n,x);
		System.out.printf("Resultado do Somatorio: " +ft.format(somatorio));
		sc.close();
	}

}