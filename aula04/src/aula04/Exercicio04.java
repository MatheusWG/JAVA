package aula04;

import java.util.Scanner;

public class Exercicio04 {

	public static double calcular(String sexo, double altura) {
		double pesoIdeal = 0;
		if (sexo.equalsIgnoreCase("m")) {
			pesoIdeal = 77.2 * altura - 58;
		} else if (sexo.equalsIgnoreCase("f")){
			pesoIdeal = 66.2 * altura - 44.7;
		}
		return pesoIdeal;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String sexo = teclado.next();
		double altura = teclado.nextDouble();
		
		System.out.println("Resultado = " + calcular(sexo,altura) );
		teclado.close();
	}

}
