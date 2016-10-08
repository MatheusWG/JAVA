package br.edu.unoesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Questao01 {

	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<>();
		List<Integer> lista = new ArrayList<>();
		conjunto.add(2);
		conjunto.add(5);
		conjunto.add(3);
		conjunto.add(9);
		conjunto.add(2);
		conjunto.add(4);
		conjunto.add(3);
		conjunto.add(8);
		conjunto.add(5);

		lista.add(2);
		lista.add(5);
		lista.add(3);
		lista.add(9);
		lista.add(2);
		lista.add(4);
		lista.add(3);
		lista.add(8);
		lista.add(5);
		System.out.println("Imprimindo Set");
		Collections.sort(lista);
		Iterator<Integer> itc = conjunto.iterator();
		while (itc.hasNext()) {
			System.out.println(itc.next());
		}
		System.out.println("Imprimindo List");
		Iterator<Integer> itl = lista.iterator();
		while (itl.hasNext()) {
			System.out.println(itl.next());
		}

	}

}
