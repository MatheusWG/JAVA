package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao06 {

	public static double potencia(double b, double e) {
		double ac = 1;
		for (int i = 0; i < e; i++) {
			ac = b * ac;
		}
		if (e == 0)
			ac = 1;
		if (e == 1)
			ac = b;
		return ac;
	}

	public static void main(String[] args) {
		NumberFormat ft = new DecimalFormat("#0");
		System.out.println("Digite o valor da base: ");
		double b = Teclado.lerDouble();
		System.out.println("Digite o valor do expoente: ");
		double e = Teclado.lerDouble();
		double r = potencia(b, e);
		System.out.println(ft.format(b) + " elevado a " + ft.format(e) + " = " + ft.format(r));

	}

}
