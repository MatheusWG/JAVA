package br.edu.unoesc;

import java.util.ArrayList;
import java.util.List;

public class Exer01 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		long it = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			numeros.add(i);
		}
		for (int i = 0; i < 100000; i++) {
			numeros.contains(i);
			System.out.println("Numero: " + numeros.get(i));
		}
		long ft = System.currentTimeMillis();
		long tempo = ft - it;
		System.out.println("Tempo Gasto: " + (tempo / 1000) + " s");

		int a[] = new int[1000000];
		long it2 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			a[i] = i;
		}
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		long ft2 = System.currentTimeMillis();

		long tempo2 = ft2 - it2;
		System.out.println("Tempo Gasto: " + (tempo / 1000) + " s");
		System.out.println("Tempo Gasto: " + (tempo2 / 1000) + " s");
	}

}
