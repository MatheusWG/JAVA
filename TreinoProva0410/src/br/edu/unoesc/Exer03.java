package br.edu.unoesc;

import java.util.ArrayList;
import java.util.List;

public class Exer03 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		while (true) {
			int i = Teclado.lerInt();
			if (i == -1)
				break;
			numeros.add(i);
		}
		mostranumerosdalista(numeros);
	}

	public static void mostranumerosdalista(List<Integer> numeros) {
		numeros.stream().filter(p -> (p%2==0)).forEach(p -> System.out.println(p));
	}
}
