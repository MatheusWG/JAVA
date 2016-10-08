package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#00");
		NumberFormat ft1 = new DecimalFormat("#0.00");
		double menoraltura = 999;
		double maioraltura = 1;
		double mediaaltura = 0;
		int homens = 0;
		int mulheres = 0;
		double phomens = 0;
		double pmulheres = 0;
		double total = 0;

		String sexo = null;
		for (int i = 0; i < 50; i++) {
			System.out.println("Informe seu sexo: ");
			sexo = sc.next();
			if (sexo.equalsIgnoreCase("m"))
				homens++;
			if (sexo.equalsIgnoreCase("f"))
				mulheres++;
			System.out.println("Informe sua altura: ");
			double altura = sc.nextDouble();
			if (sexo.equalsIgnoreCase("f"))
				total += altura;
			if (altura < menoraltura)
				menoraltura = altura;
			if (altura > maioraltura)
				maioraltura = altura;
		}
		phomens = (homens * 100) / 50;
		pmulheres = (mulheres * 100) / 50;
		mediaaltura = total / mulheres;
		System.out.println("Maior Altura: " + maioraltura + "m");
		System.out.println("Menor Altura: " + menoraltura + "m");
		System.out.println("Media de Altura das Mulheres: " + ft1.format(mediaaltura) + "m");
		System.out.println("Quantidade de Homens: " + homens);
		System.out.println("Porcentagem de Homens: " + ft.format(phomens) + "%");
		System.out.println("Porcentagem de Mulheres: " + ft.format(pmulheres) + "%");

		sc.close();

	}
}
