package br.edu.unoesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questao03 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Integer n = 0;

		while (n != -1) {
			System.out.println("Informe o número");
			n = Teclado.lerInt();
			if (n != -1)
				numeros.add(n);
		}
		System.out.println("Maior da Lista");
		Integer maior = -999;
		Integer menor = 999;
		Integer soma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			
			soma += numeros.get(i);
			if (numeros.get(i) > maior)
			maior = numeros.get(i);
			if (numeros.get(i) < menor)
			menor = numeros.get(i);
		}
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Soma = " + soma);
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}
