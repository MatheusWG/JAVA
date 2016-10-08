package br.edu.unoesc;

public class Exemplo02 {

	/*public static int somarVetor(int vet[]) {
		int soma = 0;
		for (int i = 0; i < 6; i++) {
			soma += vet[i];
		}
		return soma;
	}*/

	public static void main(String[] args) {

		int vetor[] = { 10, 20, 30, 40, 50, 60 };
		int s = Matematica.somarVetor(vetor);

		System.out.println("Soma = " + s);
	}
}
