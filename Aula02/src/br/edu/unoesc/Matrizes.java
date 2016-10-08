package br.edu.unoesc;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matriz[i][j] = teclado.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		teclado.close();
	}

}
