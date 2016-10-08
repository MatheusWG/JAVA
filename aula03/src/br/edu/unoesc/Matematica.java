package br.edu.unoesc;

public class Matematica {

	public static int somarVetor(int vet[]) {
		int soma = 0;
		for (int i = 0; i < 6; i++) {
			soma += vet[i];
		}
		return soma;
	}

	public static double calcularMedia(double n1, double n2) {

		double md = ((n1 + n2) / 2);
		return md;
	}
}
