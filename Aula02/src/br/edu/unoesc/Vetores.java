package br.edu.unoesc;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[10]; 
		System.out.println("informe os 10 valores");
		// vetor[0] = 10;
		int i;
		for (i = 0; i < 10; i++) {
			vetor[i] = teclado.nextInt(); // sysout-
		}
		for (i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
		teclado.close();
	}

}
