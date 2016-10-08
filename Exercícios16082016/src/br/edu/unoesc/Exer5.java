package br.edu.unoesc;

import java.util.Scanner;

public class Exer5 {

	public static String cat(int idade) {
		String categoria = null;
		if (idade > 4 && idade < 8) {
			categoria = "Infantil A";
		}
		if (idade > 7 && idade < 11) {
			categoria = "Infantil B";
		}
		if (idade > 10 && idade < 14) {
			categoria = "Juvenil A";
		}
		if (idade > 13 && idade < 18) {
			categoria = "Juvenil B";
		}
		if (idade > 18) {
			categoria = "Adulto";
		}
		return categoria;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		String cat = cat(idade);
		System.out.println("Categoria: " + cat);
		sc.close();
	}

}
