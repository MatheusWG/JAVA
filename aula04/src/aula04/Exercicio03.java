package aula04;

public class Exercicio03 {

	public static void trocar01(int valor1, int valor2) {
		int aux = valor1;
		valor1 = valor2;
		valor2 = aux;
		System.out.println("troca = " + valor1 + " " + valor2);
	}
	
	public static void trocar02(int vet[]) {
		int aux = vet[0];
		vet[0] = vet[1];
		vet[1] = aux;
	}
	
	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 20;
		int vet[] = {valor1, valor2};
		trocar01(valor1, valor2);
		trocar02(vet);
		System.out.println("Valores trocados " + vet[0] + " " + vet[1]);
	}

}
