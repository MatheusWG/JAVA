package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer7 {

	public static double juroSimples(double c, double i, int tempo) {
		double juro = c * i * tempo;
		double total = c + juro;
		return total;
	}

	public static double juroComposto(double c, double i, int tempo) {
		double juro = c * Math.pow((1 + i), tempo);
		return juro;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor capital:");
		double c = sc.nextDouble();
		System.out.println("Informe a taxa de juros mensal:");
		double i = sc.nextDouble()/100;
		System.out.println("Informe a quantidade de meses:");
		int tempo = sc.nextInt();
		System.out.println("Informe o tipo de juro, simples ou composto:");
		String tipo = sc.next();

		NumberFormat ft = new DecimalFormat("#0.00");

		if (tipo.equalsIgnoreCase("simples")) {
			double juro = juroSimples(c, i, tempo);
			double mes = juro / tempo;
			System.out.println("O total a pagar por mes e de: R$ " + ft.format(mes));
			System.out.println("Total a pagar: R$ " + ft.format(juro));
			System.out.println("Juros Total: R$ " + (juro - c));
		}

		else if (tipo.equalsIgnoreCase("composto")) {
			double montante = juroComposto(c, i, tempo);
			double parcela[] = new double[tempo];
			double panterior = c/tempo;
			for (int j = 0; j < tempo; j++) {
				parcela[j] = panterior + (i*panterior);
				panterior = parcela[j];
			}

			for (int j = 0; j < tempo; j++) {
				int g = j + 1;
				System.out.println("Total a pagar no mes " + g + ": R$ " + ft.format(parcela[j]));
			}
			System.out.println("Total a pagar: R$ " + ft.format(montante));
			System.out.println("Juros total: R$ " + ft.format(montante - c));
		}

		sc.close();
	}

}
