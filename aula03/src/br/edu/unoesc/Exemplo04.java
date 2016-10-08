package br.edu.unoesc;

public class Exemplo04 {

	public static void modificarValores(int numero) {
		numero += 10;
	}

	public static void modificarVetor(int numeros[]) {
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
}

	public static void main(String[] args) {

		int n = 50;
		int v[] = { 100, 200, 300 };
		modificarValores(n);
		modificarVetor(v);
		System.out.println(n);
		System.out.println(v[0] + ", " + v[1] + ", " + v[2]);
	}
}
