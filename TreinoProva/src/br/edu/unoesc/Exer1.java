package br.edu.unoesc;

import java.util.Scanner;

public class Exer1 {

	public static boolean isPositive(float num) {
		boolean resposta = false;
		if (num >= 0) {
			resposta = true;
		}
		return resposta;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número para saber se ele é negativo ou positivo");
		float num = sc.nextFloat();
		boolean resposta = isPositive(num);
		if (resposta)
			System.out.println("O número digitado é positivo!");
		if (!resposta)
			System.out.println("O numero digitado é negativo!");
		sc.close();

	}

}
