package br.edu.unoesc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exer05 {

	public static void main(String[] args) {
		List<Integer> lista1 = new ArrayList<>();
		List<Integer> lista2 = new ArrayList<>();

		lista1.add(5);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(6);
		lista1.add(18);
		lista1.add(0);

		lista2.add(5);
		lista2.add(2);
		lista2.add(20);
		lista2.add(15);
		lista2.add(14);
		lista2.add(13);
		lista2.add(12);

		Set<Integer> emcomum = new HashSet<>();

		for (Integer c : lista1)
			for (Integer d : lista2) {
				if (c == d) {
					emcomum.add(c);
				}
			}
		System.out.println(emcomum);
	}

}