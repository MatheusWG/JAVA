package br.edu.unoesc;

import java.util.*;

public class Exemplo {

	public static void main(String[] args) {
		Set<String> conjunto = new TreeSet<>(); // new HasjSet<>();

		conjunto.add("joao");
		conjunto.add("joao");
		conjunto.add("ana");

		Iterator<String> it = conjunto.iterator();
		while (it.hasNext()) {
			String nome = it.next();
			System.out.println(nome);
		}
	}
}
