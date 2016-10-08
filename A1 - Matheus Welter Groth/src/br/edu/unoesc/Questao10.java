package br.edu.unoesc;

public class Questao10 {

	public static int peca(String peca, int tabuleiro[][]) {
		int a = 0;
		int peoes = 0;
		int cavalos = 0;
		int torres = 0;
		int bispos = 0;
		int reis = 0;
		int rainhas = 0;
		int ausentes = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (tabuleiro[i][j] == 0)
					ausentes++;
				if (tabuleiro[i][j] == 1)
					peoes++;
				if (tabuleiro[i][j] == 2)
					cavalos++;
				if (tabuleiro[i][j] == 3)
					torres++;
				if (tabuleiro[i][j] == 4)
					bispos++;
				if (tabuleiro[i][j] == 5)
					reis++;
				if (tabuleiro[i][j] == 6)
					rainhas++;
			}
		}
		if (peca.equalsIgnoreCase("peoes"))
			a = peoes;
		if (peca.equalsIgnoreCase("cavalos"))
			a = cavalos * 2;
		if (peca.equalsIgnoreCase("torres"))
			a = torres * 3;
		if (peca.equalsIgnoreCase("bispos"))
			a = bispos * 4;
		if (peca.equalsIgnoreCase("reis"))
			a = reis * 5;
		if (peca.equalsIgnoreCase("rainhas"))
			a = rainhas * 6;
		if (peca.equalsIgnoreCase("ausentes"))
			a = ausentes;
		return a;
	}

	public static void main(String[] args) {

		int tabuleiro[][] = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				tabuleiro[i][j] = Teclado.lerInt();
			}
		}

		boolean r = true;
		while (r) {
			System.out.println("Digite o nome da peça ou digite cancelar caso queira cancelar: ");
			String peca = Teclado.lerString();
			if (peca.equalsIgnoreCase("cancelar"))
				break;
			if (peca.equalsIgnoreCase("ausentes"))
				System.out.println("Numero de ausentes: " + peca(peca, tabuleiro));
			else
				System.out.println("Soma total do tipo de pecas = " + peca(peca, tabuleiro));
		}
	}

}
