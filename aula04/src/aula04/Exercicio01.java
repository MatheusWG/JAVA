package aula04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static double conveter(double celsius) {
		return celsius * 1.8 + 32;
	}
	
	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("#0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe Celsius");
		double celsius = teclado.nextDouble();
		double far = conveter(celsius);
		System.out.println("Resultado: " + formatar.format(far));
		teclado.close();
	}

}
