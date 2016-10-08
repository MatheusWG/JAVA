package br.edu.unoesc;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		int menoridade = 999;
		int maioridade = -999;
		Scanner sc = new Scanner(System.in);
		String nome[] = new String[3];
		String strmenoridade = null;
		String strmaioridade = null;
		int idade[] = new int[3];
		for (int i = 0; i < idade.length; i++) {
			System.out.println("Digite seu nome: ");
			nome[i] = sc.next();
			System.out.println("Digite sua idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] < menoridade) {
				menoridade = idade[i];
				strmenoridade = nome[i];
			}
			if (idade[i] > maioridade) {
				maioridade = idade[i];
				strmaioridade = nome[i];
			}
		}
		System.out.println("Pessoa mais velha: " + strmaioridade);
		System.out.println("Pessoa mais jovem: " + strmenoridade);
		sc.close();

	}

}
