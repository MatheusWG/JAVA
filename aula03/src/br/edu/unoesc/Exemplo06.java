package br.edu.unoesc;

public class Exemplo06 {

	public static int calcularFatorial(int n) {
		int num = 1;
		for (int i = n; i > 1; i--) {
			num *= i;
		}
		return num;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = new int[5];
		for (int i = 0; i < 5; i++) {
			b[i] = calcularFatorial(a[i]);	
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Fatorial de " + a[i] + " = " + b[i]);
		}
		
	}
}
