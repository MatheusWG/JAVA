package br.edu.unoesc;

import java.util.Scanner;

public class Exemplo05 {

	public static int calcularFatorial(int n) {
		int num = 1;
		for (int i = n; i > 0; i--) {
			num *= i;
		}
		return num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = calcularFatorial(n);
		System.out.println("Fatorial de " + n + " = " + num);
		sc.close();
	}
}
